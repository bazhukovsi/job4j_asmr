package asmr.ru.tasks2;

public class Task94 {
    public static void loop(int[] diameter, int[] weight) {
        // диаметр не более 2, вес не более 3
        String output = "";
        for (int i = 0; i < diameter.length; i++) {
            if ((diameter[i] <= 26 && diameter[i] >= 22) && ((weight[i] <= 77 && weight[i] >= 71))) {
                output += "Да" + ", ";
            } else {
                output += "Нет" + ", ";
            }
        }
        System.out.println(output.substring(0, output.length() - 2));
    }

    public static void main(String[] args) {
        int[] diameter = {24, 22, 26, 26, 27};
        int[] weight = {77, 74, 78, 71, 74};
        loop(diameter, weight);
    }
}
