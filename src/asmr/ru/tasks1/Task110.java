package asmr.ru.tasks1;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            count++;
            if (sum >= 150) {
                count--;
                sum -= nums[i];
                break;
            }
        }
        System.out.println("Сумма: " + sum + ", количество: " + count);
    }

    public static void main(String[] args) {
        int[] nums = {150, 40, 50, 60, 70};
        loop(nums);
    }
}
