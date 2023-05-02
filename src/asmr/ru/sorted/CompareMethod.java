package asmr.ru.sorted;

public class CompareMethod {
    public static int ascendingCompare(int first, int second) {
        int rezult = 0;
        rezult = Integer.compare(first, second);
        return rezult;
    }

    public static int descendingCompare(int first, int second) {
        int rezult = 0;
        rezult = Integer.compare(second, first);
        return rezult;
    }

    public static void main(String[] args) {

    }
}
