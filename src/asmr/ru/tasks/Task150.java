package asmr.ru.tasks;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int count = 0;
        for (int i = 0; i < transfers.length; i++) {
            if (transfers[i] == 0) {
                break;
            }
            if (account < overdraft ) {
                account -= transfers[i];
                count++;
                break;
            }
            account += transfers[i];
            if (account >= overdraft) {
                count++;
            } else {
                account -= transfers[i];
            }
        }
        System.out.println("Остаток: " + account + ", операций: " + count);
    }


    public static void main(String[] args) {
        int[] transfers = {-400, 200, 0, 300};
        loop(-100, 500, transfers);
    }
}
