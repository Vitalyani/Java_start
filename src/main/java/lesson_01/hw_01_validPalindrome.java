package lesson_01;

public class hw_01_validPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left ++;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right --;
            }
            if (Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))) {
                char ch1 = Character.toLowerCase(s.charAt(left));
                char ch2 = Character.toLowerCase(s.charAt(right));
                if (ch1 != ch2) {
                    return false;
                } else {
                    left ++;
                    right --;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
