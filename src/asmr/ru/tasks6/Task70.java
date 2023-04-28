package asmr.ru.tasks6;

// (x - a) ^ 2 + (y - b) ^ 2 = r ^ 2,
// где a и b - координаты центра окружности, r - радиус окружности, x и y - координаты точек окружности
// (x - a) ^ 2 + (y - b) ^ 2 < r ^ 2 - внутри
// На окружности: 0, внутри: 3

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        for (int i = 0; i < coords.length; i+= 2) {
            if ((coords[i] - x) * (coords[i] - x) + (coords[i + 1] - y) * (coords[i + 1] - y) == r * r) {
                on++;
            }
        }
        for (int i = 0; i < coords.length; i+= 2) {
            if ((coords[i] - x) * (coords[i] - x) + (coords[i + 1] - y) * (coords[i + 1] - y) < r * r) {
                in++;
            }
        }
        System.out.println("На окружности: " + on + ", внутри: " + in);
    }

    public static void main(String[] args) {
        int [] coords = {0, 0, 1, 1, 2, 2};
        loop(0,0,3,coords);
    }
}
