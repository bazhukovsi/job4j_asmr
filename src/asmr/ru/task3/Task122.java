package asmr.ru.task3;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        String[] strings;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            strings = String.valueOf(nums[i]).split("");
            for (int j = 0; j < strings.length; j++) {
                sum += Integer.parseInt(strings[j]);
            }
            if (sum != 5) {
                joiner.add(String.valueOf(nums[i]));
            } else {
                break;
            }
            sum = 0;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] nums = {11, 222, 36, 23, 10};
        loop(nums);
    }
}
