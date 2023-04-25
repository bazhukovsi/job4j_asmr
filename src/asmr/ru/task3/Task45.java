package asmr.ru.task3;

public class Task45 {
    public static void changeToRoundNum(int number) {
        String[] nums = String.valueOf(number).split("");
        if (nums[nums.length - 1].equals("0")) {
           System.out.println("Без изменений");
            return;
        }

        if (Integer.parseInt(nums[nums.length - 1]) % 2 != 0) {
            nums[nums.length - 1] = "0";
            System.out.print("Уменьшено до ");
        } else {
            nums[nums.length - 2] = String.valueOf(Integer.parseInt(nums[nums.length - 2]) + 1);
            nums[nums.length - 1] = "0";
            System.out.print("Увеличено до ");
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        changeToRoundNum(550);
    }
}
