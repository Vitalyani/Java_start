package lesson_03;

import java.util.ArrayList;
import java.util.List;

public class Hw_03_Equation {
    static char[] textGlobal;
    static List<Integer> signIndexGlobal;

    public static void main(String[] args) {
        restore(" 2? + ?5 = 69");
        restore(" ?5? + 3?5 = 6?0");
    }

    public static void restore(String text) {
        List<Integer> signIndex = new ArrayList<>();
        // заменяем все пробелы в тексте и переводим в массив символов (.toCharArray())
        char[] textChar = text.replace(" ", "").toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '?') {
                signIndex.add(i);// запоминаем индексы знаков '?'
            } else if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '_';
            }
        }
        textGlobal = textChar;
        signIndexGlobal = signIndex;
        generateCombination(new int[signIndex.size()], 0, 10);
    }

    private static void generateCombination(int[] comb, int index, int decimalDigit) {
        if (index == comb.length) {
            checkComb(comb);
            return;
        }

        for (int i = 0; i < decimalDigit; i++) {
            comb[index] = i;
            generateCombination(comb, index + 1, decimalDigit);
        }
    }

    private static void checkComb(int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            textGlobal[signIndexGlobal.get(i)] = Character.forDigit(comb[i], 10);
            // на место, где стоит "?" (signIndexGlobal) подставляем цифру с комбинации (comb[i])
            // в типе символ (при помощи Character.forDigit)
        }
        // текст хранится в массиве с элементами Char, поэтому переводим в строку
        // получаем массив из строк
        String[] numbers = String.valueOf(textGlobal).split("_");
        // разбираем массив на 3 части и парсим строки в числа
        int q = Integer.parseInt(numbers[0]);
        int w = Integer.parseInt(numbers[1]);
        int e = Integer.parseInt(numbers[2]);

        if (q + w == e) {
            System.out.printf("%d + %d = %d\n", q, w, e);
        }
    }
}
