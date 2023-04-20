package asmr.ru.tasks;

public class Task66 {
    public static void loop(int num) {
        int count = 0;
        String output = "";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                output += i + " ";
            }
        }
        if (num == 1 || output.equals("")) {
            System.out.println("Количество: " + count + ", Делители: " + count);
        } else {
            System.out.println("Количество: " + count + ", Делители: " + output.trim());
        }
    }

    public static void main(String[] args) {
        loop(17);
    }
}
