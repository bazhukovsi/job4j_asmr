package asmr.ru.tasks;

public class Task86 {
    public static void loop(int[] num) {
        int sumNumber = 0;
        int sumNumberMult2 = 0;
        String output = "";
        for (int i = 0; i < num.length; i++) {
            sumNumber = num[i] / 10 + (num[i] % 10);
            sumNumberMult2 = num[i] * 2 / 10 + (num[i] * 2 % 10);
            if (sumNumber == sumNumberMult2) {
                output += num[i] + " ";
            }
        }
        if ("".equals(output)) {
            System.out.println("Стабильных чисел нет");
        } else {
            System.out.println(output.trim());
        }
    }

    public static void main(String[] args) {
        int[] num = {39, 39};
        loop(num);
    }
}
