package asmr.ru.task5;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor = (int) Math.ceil(number * 1.0 / 3);
        int place = 0;
        int apartmentLeft = ((floor - 1) * 3) + 1;
        int apartmentCenter = ((floor - 1) * 3) + 2;
        int apartmentRight = ((floor - 1) * 3) + 3;
        if (number == apartmentLeft) {
            place = 1;
        }
        if (number == apartmentCenter) {
            place = 2;
        }
        if (number == apartmentRight) {
            place = 3;
        }
        System.out.println(floor);
        System.out.println(place);
    }

    public static void main(String[] args) {
        apartmentPlace(12);
    }
}
