package asmr.ru.task3;

import java.util.Arrays;

public class Task81 {
    public static int[] array(int[] nums) {
        int [] out = {0,0,0};
        int countNeg = 0;
        int countZero = 0;
        int countPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                countNeg++;
            }
            if (nums[i] == 0) {
                countZero++;
            }
            if (nums[i] > 0) {
                countPos++;
            }
        }
        out[0] = countNeg;
        out[1] = countZero;
        out[2] = countPos;
        return out;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,0,0,0,0,-2,-3,-4};
        int [] array = array(arr);
        System.out.println(Arrays.toString(array));
    }
}
