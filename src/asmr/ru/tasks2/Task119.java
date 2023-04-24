package asmr.ru.tasks2;

public class Task119 {
    public static void loop(int num, int digit) {
        String[] strNums = String.valueOf(num).split("");
        String out = "Нет";
        for (int i = 0; i < strNums.length; i++) {
            if (Integer.parseInt(strNums[i]) == digit) {
                out = "Да";
                break;
            }
        }
        System.out.println(out);
    }

    public static void main(String[] args) {
        loop(235, 6);
    }
}
