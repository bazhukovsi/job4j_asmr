package asmr.ru.tasks1;

public class Task109 {
    public static void loop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 123) {
                System.out.println("Код не принят");
            } else {
                System.out.println("Код принят");
                break;
            }
        }

    }

    public static void main(String[] args) {
        int [] nums = {3,-20,0,999,123,789};
        loop(nums);
    }
}
