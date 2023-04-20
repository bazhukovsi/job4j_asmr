package asmr.ru.tasks;

public class Task65 {
    public static void loop(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos++;
            }
            if (nums[i] < 0) {
                neg++;
            }
        }
        if (pos == neg) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        int [] nums = {-1,-2,0,1,2,4};
        loop(nums);
    }
}
