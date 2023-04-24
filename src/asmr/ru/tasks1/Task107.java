package asmr.ru.tasks1;

public class Task107 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 999) {
                break;
            } else {
                count++;
                System.out.println(nums[i]);
            }
        }
        System.out.println("Значений: " + count);
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,-20,0,999,20};
        loop(nums);
    }
}
