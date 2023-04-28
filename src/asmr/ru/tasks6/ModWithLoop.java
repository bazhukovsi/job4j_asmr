package asmr.ru.tasks6;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int retVal = Integer.MAX_VALUE;
        while (retVal >= 0) {
            if (n == 0) {
                return 0;
            }
            retVal = (n -= d);
        }
        retVal += d;
        return  retVal;
    }

    public static void main(String[] args) {
        int ostatok = mod(0, 3);
        System.out.println(ostatok);
    }
}
