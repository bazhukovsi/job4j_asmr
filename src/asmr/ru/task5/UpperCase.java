package asmr.ru.task5;

public class UpperCase {
    public static char[] onlyLowCase(char[] input) {
        String out = "";
        char[] outChar = new char[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 97 && input[i] <= 122) {
                out += input[i];
            }
        }
        outChar = out.toUpperCase().toCharArray();
        return outChar;
    }

    public static void main(String[] args) {
        char[] charArr = "aLpha - 1-0!@#$5".toCharArray();
        char[] chars = onlyLowCase(charArr);
        System.out.println(chars);
    }
}
