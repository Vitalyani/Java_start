package lesson_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Cat {
    int id;
    String petType;
    String petNickname;
    String petColor;
    int petAge;


    @Override
    public String toString() {
        return String.format("id:%d", id);
    }

    // 4. Создайте метод public boolean equals(Object o)
    //Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
    public boolean equals(Object o) {
        Cat t = (Cat) o;
        return id == t.id && Objects.equals(petType, t.petType) &&
                Objects.equals(petNickname, t.petNickname) &&
                Objects.equals(petColor, t.petColor) &&
                petAge == t.petAge;
    }

    //5. Переопределите метод хэшкод, пусть возвращает айди животного.
    @Override
    public int hashCode() {
        return id;
    }


    public static void main(String[] args) {
        Cat pet1 = new Cat();
        pet1.id = 1;
        pet1.petType = "Кот";
        pet1.petNickname = "Барсик";
        pet1.petColor = "Рыже-полосатый";
        pet1.petAge = 5;

        Cat pet2 = new Cat();
        pet2.id = 2;
        pet2.petType = "Кот";
        pet2.petNickname = "Мурзик";
        pet2.petColor = "Черно-белый";
        pet2.petAge = 1;

        Cat pet3 = new Cat();
        pet3.id = 3;
        pet3.petType = "Кошка";
        pet3.petNickname = "Дымка";
        pet3.petColor = "Серая";
        pet3.petAge = 4;

        // 3. Создайте 2 или более котов с одинаковыми параметрами в полях.
        Cat pet4 = new Cat();
        pet4.id = 2;
        pet4.petType = "Кот";
        pet4.petNickname = "Мурзик";
        pet4.petColor = "Черно-белый";
        pet4.petAge = 1;


        // 1. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
        System.out.println(
                "Домашнее животное: " + pet1.petType +
                        "\nКличка: " + pet1.petNickname +
                        "\nОкрас: " + pet1.petColor +
                        "\nПолных лет: " + pet1.petAge
        );
        System.out.println("""

                ________________________
                """);


        // 2. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
        var pets = new HashSet<>(Arrays.asList(pet1, pet2, pet3, pet4));

        // 3. Поместите их во множество. Убедитесь, что все они сохранились во множество.
        pets.add(pet4);
        System.out.println(pets);
        // 6. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
    }
}
