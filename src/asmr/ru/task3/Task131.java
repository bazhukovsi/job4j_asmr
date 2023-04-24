package asmr.ru.task3;

import java.util.StringJoiner;

public class Task131 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
                if (count == 3) {
                    break;
                }
                joiner.add(String.valueOf(nums[i]));
            } else {
                joiner.add(String.valueOf(nums[i]));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        loop(nums);
    }
}
