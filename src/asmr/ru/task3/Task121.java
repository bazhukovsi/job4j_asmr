package asmr.ru.task3;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        String [] strings;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            strings = String.valueOf(nums[i]).split("");
            for (int j = 0; j < strings.length; j++) {
                sum += Integer.parseInt(strings[j]);
            }
            joiner.add(String.valueOf(sum));
            sum = 0;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] nums = {20, 321, 452, 58, 5};
        loop(nums);
    }
}
