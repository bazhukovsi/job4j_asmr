package asmr.ru.stream;

import java.util.Arrays;

public class TerminalForPrimitive {
    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data).max().getAsInt();
    }

    public long min() {
        return Arrays.stream(data).min().getAsInt();
    }

    public double avg() {
        return Arrays.stream(data).average().getAsDouble();
    }

    public long sum() {
        return Arrays.stream(data).sum();
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        TerminalForPrimitive terminal = new TerminalForPrimitive(data);
        long count = terminal.count();
        long max = terminal.max();
        long min = terminal.min();
        long sum = terminal.sum();
        double avg = terminal.avg();
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(avg);
    }
}
