package asmr.ru.task3;

public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        print(array);
    }
}
