package asmr.ru.task3;

import java.util.Arrays;

public class Task76 {
    public static void array(int[] arr) {
        int [] colGrade = new int[5];
        int count = 0;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            colGrade[colGrade.length - i] = count;
            count = 0;
        }
        System.out.println("5: "+ colGrade[0] + ", 4: " + colGrade[1] + ", 3: " + colGrade[2] +
                ", 2: " + colGrade[3] + ", 1: " + colGrade[4]);
    }

    public static void main(String[] args) {
        int [] array = {5,1,2,3,4,5};
        array(array);
    }

}
