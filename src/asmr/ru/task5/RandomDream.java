package asmr.ru.task5;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String out = "";
        int index = 0;
        if (num <= prizes.length) {
            out = prizes[num - 1];
        } else {
            index = num % prizes.length;
            if (index == 0) {
                out = prizes[3];
            } else {
                out = prizes[index - 1];
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String out = random(prizes, 12);
        System.out.println(out);
    }
}
