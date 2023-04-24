package asmr.ru.task3;

public class Task120 {
    public static void loop(int num) {
        String output = "";
        String strNums = String.valueOf(num);
        for (int i = 0; i < strNums.length(); i++) {
            output += strNums.substring(0, strNums.length() - i - 1) + " ";
        }
        if (strNums.length() == 1) {
            System.out.println("0");
        } else {
            System.out.println(output.trim() + " 0");
        }
    }

    public static void main(String[] args) {
        loop(54321);
    }
}
