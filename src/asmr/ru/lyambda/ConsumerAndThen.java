package asmr.ru.lyambda;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer consumer(String str) {
        Consumer con = (s) -> System.out.print(str);
        Consumer ln = (s) -> System.out.println();
        Consumer rezult = con.andThen(ln);
        return rezult;
    }

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer);
        System.setOut(printStream);
        String input = "job4j";
        String expect = String.format("%s%s", input, System.lineSeparator());
        ConsumerAndThen.consumer(input).accept(input);
        System.setOut(out);
    }
}
