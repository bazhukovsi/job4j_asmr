package asmr.ru.tasks2;

public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            num -= nums[i];
            if (num > 0) {
                count ++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        loop(10, nums);
    }
}
