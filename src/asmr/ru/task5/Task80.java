package asmr.ru.task5;

import java.util.Arrays;

public class Task80 {
    public static int[] array(int[] nums) {
        int[] arr = new int[5];
        int temp = 0;
        int index = 0;
        int count = 0;
        int newLength = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (temp == nums[j]) {
                    count++;
                }
            }
            if (count <= 1) {
                arr[index] = i;
                index++;
                newLength++;
            }
            count = 0;
        }
        int [] newArr = new int[newLength];
        System.arraycopy(arr, 0, newArr, 0, newLength);
        return newArr;
    }

    public static void main(String[] args) {
        int[] nums = {5, 5, 4, 3, 3, 1};
        int[] out = array(nums);
        System.out.println(Arrays.toString(out));
    }
}
