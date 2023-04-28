package asmr.ru.tasks6;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int group = 0;
        int cChickets = 0;
        int aChickets = 0;
        for (int i = 0; i < cNum.length; i++) {
            if ((cNum[i] + aNum[i] < children + adults || cNum[i] + aNum[i] == children + adults) && (cNum[i] <= children) && (aNum[i] <= adults)) {
                group++;
                children -= cNum[i];
                adults -= aNum[i];
                cChickets += cNum[i];
                aChickets += aNum[i];
            }
        }
        System.out.println("Группы: " + group + ", Взрослых: " + aChickets + ", детей: " + cChickets + ", осталось билетов взр: " +
                adults + ", осталось билетов дет: " + children);
    }

    public static void main(String[] args) {
        int[] children = {10, 2};
        int[] adults = {10, 3};
        loop(10, 10, children, adults);
    }
}
