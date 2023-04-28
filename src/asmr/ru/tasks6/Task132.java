package asmr.ru.tasks6;

public class Task132 {
    public static void loop(int[] nums) {
        String out = "";
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            out += nums[i] + " ";
            if (nums[i] % 2 == 0 && i % 2 == 0) {
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        System.out.println(out.trim().substring(0,out.length() - 3));
        System.out.printf("%s%s,I am %d years old", "boy", "Hello", 12);
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 6, 8, 0};
        loop(nums);
    }
}
