package asmr.ru.tasks1;

public class Task108 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 999) {
                break;
            } else {
                sum += nums[i];
                System.out.println(nums[i]);
            }
        }
        System.out.println("Сумма: " + sum);
    }

    public static void main(String[] args) {
        int [] nums = {3,-20,0,999,20};
        loop(nums);
    }
}
