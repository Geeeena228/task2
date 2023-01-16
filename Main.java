import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeat("qwe", 5));
        System.out.println(differenceMaxMin(new int[]{12,10,5,78}));
        System.out.println(isAvgWhole(new int[]{1,1,2}));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println(getDecimalPlaces("123.3450"));
        System.out.println(fibonacchi(7));
        System.out.println(isValid("12345"));
        System.out.println(isStrangePair("qwe", "ewq"));
        System.out.println(boxSeq(2));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("automation", "auto-"));
    }

    public static String repeat(String s, int n) {
        String s1 = "";
        for (char i : s.toCharArray()) {
            s1 += Character.toString(i).repeat(n);
        }
        return s1;
    }

    public static int differenceMaxMin(int[] mas){
        int raz = 0;
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i<mas.length;i++){
            if (max<mas[i]){
                max = mas[i];
            }
            if(min > mas[i]){
                min = mas[i];
            }
        }
        return (max - min);
    }
    public static boolean isAvgWhole(int[] mas){
        int averageValue = 0;
        for (int i = 0; i<mas.length;i++){
            averageValue +=mas[i];
        }
        if (averageValue % mas.length != 0){
            return false;
        }
        else {
            return true;
        }
    }
    public static int[] cumulativeSum(int[] mas){
        for (int i = 1; i < mas.length; i++) {
            mas[i] += mas[i - 1];
        }
        return mas;
    }
    public static int getDecimalPlaces(String num){
        String[] arr = num.split("\\.");
        if (arr.length == 2) {
            return arr[1].length();
        }
        return 0;
    }
    public static int fibonacchi(int n){
        int result = 0;
        int a = 1;
        int b = 1;
        for(int i = 1; i<n; i++){
            result = a+b;
            a = b; // а второй элемент
            b = result;
        }
        return result;
    }
    public static boolean isValid(String s){
        int length1 = s.length();
        if (length1 > 5){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i); //chartAt берет определенный символ
            if (!(Character.isDigit(letter))) { // Character.isDigit() проверяет является ли цифрой
                return false;
            }
        }
        return true;
    }
    public static boolean isStrangePair(String s1, String s2){
        if (s1.length()==0 && s2.length()==0) {
            return true;
        }
        if (s1.length()== 0 || s2.length() == 0) {
            return false;
        }
        if ((s1.charAt(0) == s2.charAt(s2.length()-1)) && (s1.charAt(s1.length()-1) == s2.charAt(0))) {
            return true;
        }
        return false;
    }

    public static boolean isPrefix(String word, String prefix){
        return word.startsWith(prefix.replace("-", "")); // startsWith проверяет начинается ли эта строка с указанного префикса
    }
    public static boolean isSuffix(String word, String suffix){
        return word.endsWith(suffix.replace("-", ""));
    }
    public static int boxSeq(int number){
        if (number % 2 == 0) {
            return number;
        } else {
            return number + 2;
        }
    }
}
