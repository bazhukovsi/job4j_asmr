package asmr.ru.tasks2;

public class Task116 {
    public static void loop(int num) {
        String [] strNum = String.valueOf(num).split("");
        int sum = 0;
        for (int i = 0; i < strNum.length; i++) {
            sum += Integer.parseInt(strNum[i]);
        }
        System.out.println("Количество: " + strNum.length + ", сумма: " + sum);
    }

    public static void main(String[] args) {
        loop(222);
    }
}
