package asmr.ru.task5;

public class Task79 {
    public static void array(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        String out = "";
        int temp = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null) {
                continue;
            }
            temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != null) {
                    if (temp == nums[j]) {
                        count++;
                        nums[j] = null;
                    }
                }
            }
            if (count > 0) {
                out += temp + " ";
                count = 0;
            }
        }
        if (out.length() > 0) {
            System.out.println(out.trim());
        }
    }


    public static void main(String[] args) {
        int[] nums = {};
        array(nums);
    }
}
