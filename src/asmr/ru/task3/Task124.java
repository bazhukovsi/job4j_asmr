package asmr.ru.task3;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int index = 0;
        String [] strings;
        for (int i = 0; i < nums.length; i++) {
            strings = String.valueOf(nums[i]).split("");
            for (int j = 0; j < strings.length; j++) {
                sum += Integer.parseInt(strings[j]);
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
            joiner.add(String.valueOf(sum));
            sum = 0;
        }
        System.out.println("Суммы: " + joiner + ", индекс: " + index);
    }

    public static void main(String[] args) {
        int [] nums = {4, 351, 250, 29, 93};
        loop(nums);
    }
}
