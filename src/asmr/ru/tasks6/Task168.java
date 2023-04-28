package asmr.ru.tasks6;

//Цифр: 2, сумма цифр: 1, делителей: 4
//Цифр: 1, сумма цифр: 5, делителей: 2
//Цифр: 3, сумма цифр: 5, делителей: 6
//Сумма всех цифр: 11

public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        String[] strNum1 = String.valueOf(num1).split("");
        String[] strNum2 = String.valueOf(num2).split("");
        String[] strNum3 = String.valueOf(num3).split("");
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < strNum1.length; i++) {
            sum1 += Integer.parseInt(strNum1[i]);
        }
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count1++;
            }
        }
        for (int i = 0; i < strNum2.length; i++) {
            sum2 += Integer.parseInt(strNum2[i]);
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                count2++;
            }
        }
        for (int i = 0; i < strNum3.length; i++) {
            sum3 += Integer.parseInt(strNum3[i]);
        }
        for (int i = 1; i <= num3; i++) {
            if (num3 % i == 0) {
                count3++;
            }
        }
        System.out.println("Цифр: " + strNum1.length + ", сумма цифр: " + sum1 + ", делителей: " + count1);
        System.out.println("Цифр: " + strNum2.length + ", сумма цифр: " + sum2 + ", делителей: " + count2);
        System.out.println("Цифр: " + strNum3.length + ", сумма цифр: " + sum3 + ", делителей: " + count3);
        System.out.println("Сумма всех цифр: " + (sum1 + sum2 + sum3));
    }

    public static void main(String[] args) {
        loop(10, 5, 212);
    }
}

























