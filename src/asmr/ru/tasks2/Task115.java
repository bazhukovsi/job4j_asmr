package asmr.ru.tasks2;

public class Task115 {
    public static void loop(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i -1] < nums[i]) {
                sum += nums[i];
            } else {
                break;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 6};
        loop(nums);
    }
}
