package asmr.ru.task3;

public class Task22 {
    public static void haveRoots(int a, int b, int c) {
        if ((Math.pow(b,2) - 4*a*c) >= 0){
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        haveRoots(5,2,1);
    }
}
