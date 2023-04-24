package asmr.ru.task3;

public class Task134 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            sum += (int) Math.pow(i, 2);
            if (sum > num){
                sum -= (int) Math.pow(i, 2);
                break;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(33);
    }
}
