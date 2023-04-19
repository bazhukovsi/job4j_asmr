package asmr.ru.tasks;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        if (columnCount % 2 != 0) {
            for (int i = columnCount; i > 0; i -= 2) {
                if (i != columnCount) {
                    for (int j = 0; j < (columnCount - i) / 2; j++) {
                        System.out.print(space);
                    }
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(star);
                }
                System.out.println();
            }
            for (int i = 3; i <= columnCount; i += 2) {
                if (i != columnCount) {
                    for (int j = 0; j < (columnCount - i) / 2; j++) {
                        System.out.print(space);
                    }
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(star);
                }
                System.out.println();
            }
        }
    }
}

