package lesson_01;

public class hw_01_reverseWord {
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = s.length() - 1; i >=0; i--) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                temp.append(s.charAt(i));
                if(i == 0){
                    sb.append(temp.reverse());
                    temp.delete(0, s.length() - 1);
                }
            }
            else {
                sb.append(temp.reverse());
                if(temp.length() == 0){
                    continue;
                }
                sb.append(" ");
                temp.delete(0, s.length() - 1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println('"' + reverseWords(str) + '"');
    }
}
