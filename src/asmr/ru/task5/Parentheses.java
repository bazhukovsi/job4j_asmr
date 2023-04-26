package asmr.ru.task5;

public class Parentheses {
    public static boolean valid(char[] data) {
        int left = 0;
        int right = 0;
        if (data[0] == ')') {
            return false;
        }
        if (data[data.length - 1] == '(') {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '(') {
                left++;
            }
            if (data[i] == ')') {
                right++;
            }
        }
        if (left == right) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        char [] data = {'(', ')', '('};
        boolean valid = valid(data);
        System.out.println(valid);
    }
}
