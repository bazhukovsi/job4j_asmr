package asmr.ru.tasks1;

public class Task106 {
    public static void loop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                break;
            } else {
                System.out.println(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,-20,0,20};
        loop(nums);
    }
}
