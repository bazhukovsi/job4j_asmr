package asmr.ru.task3;

public class Task44 {
    public static void containsZero(int number) {
        String[] nums = String.valueOf(number).split("");
        if (Integer.parseInt(nums[nums.length - 1]) < 5) {
            nums[nums.length - 1] = "0";
        } else {
            if (nums.length == 1 && Integer.parseInt(nums[nums.length - 1]) > 5) {
                System.out.println("10");
                return;
            } else {
                nums[nums.length - 2] = String.valueOf(Integer.parseInt(nums[nums.length - 2]) + 1);
                nums[nums.length - 1] = "0";
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        containsZero(54);
    }
}
