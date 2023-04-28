package asmr.ru.tasks6;

import java.util.Arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        // Расчет размерности массива
        int count = 0;
        int lengthNewArray = 0;
        int temp = 0;
        // Посчитаем количество элементов
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        // Посчитаем размерность квадратного массива
        lengthNewArray = (int) Math.ceil(Math.sqrt(count));
        int[] newArray = new int[lengthNewArray * lengthNewArray];
        count = 0;
        // Заполним одномерный массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i + count] = array[i][j];
                count++;
            }
            count--;
        }
        System.out.println(Arrays.toString(newArray));
        // Заполняем итоговый двумерный массив
        count = 0;
        int[][] rsl = new int[lengthNewArray][lengthNewArray];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                rsl[i][j] = newArray[i + count];
                count++;
            }
            count--;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
        int[][] rsl = Converter.convertInSquareArray(array);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j] + " ");
            }
            System.out.println();
        }
    }
}
