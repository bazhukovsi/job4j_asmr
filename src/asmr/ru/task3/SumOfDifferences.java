package asmr.ru.task3;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += (nums[i] - nums[i + 1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] nums = {5,3,2,1};
        int sum = sum(nums);
        System.out.println(sum);
    }
}
