package asmr.ru.task4;

public class Task80 {
    public static boolean isIdentical(char s1, char s2) {
        boolean out = false;
        if (s1 == s2) {
            out = true;
        }
        return out;
    }

    public static void main(String[] args) {
        boolean id = isIdentical('s', 'q');
        System.out.println(id);
    }
}
