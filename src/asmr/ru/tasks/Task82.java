package asmr.ru.tasks;

public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int total = 0;
        int promoTickets = 0;
        for (int i = 0; i < promo.length; i++) {
            total += promo[i];
        }
        for (int i = 0; i < concert.length; i++) {
            total += concert[i];
        }
        for (int i = 0; i < promo.length; i++) {
            promoTickets += (promo[i] / 10);
        }
        System.out.println("Продано билетов: " + total + ", выдано бесплатно: " + promoTickets);
    }

    public static void main(String[] args) {
        int[] promo = {21, 10, 2, 2};
        int[] concert = {1, 2, 5, 22};
        loop(promo, concert);
    }
}
