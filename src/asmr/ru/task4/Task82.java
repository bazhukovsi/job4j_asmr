package asmr.ru.task4;

public class Task82 {
    public static boolean isEquals(String first, String second) {
        boolean out = false;
        if (first.equals(second)) {
            out = true;
        }
        return out;
    }

    public static void main(String[] args) {
        boolean eq = isEquals("123", "1234");
        System.out.println(eq);
    }
}
