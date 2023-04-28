package asmr.ru.tasks6;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = new int[data[0].length];
        for (int i = 0; i < data[0].length; i++) {
            temp[i] = data[1][i];
        }
        for (int i = 0; i < data[0].length; i++) {
            data[1][i] = data[0][i];
            data[0][i] = temp[i];
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };
        SwapRows.swap(data, 0, 1);
    }
}
