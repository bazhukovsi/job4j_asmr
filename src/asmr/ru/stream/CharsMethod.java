package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CharsMethod {
    public static List<Character> symbols(String string) {
        return string.chars().mapToObj(n -> (char) n).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String input = "123";
        List<Character> characters = symbols(input);
        for (int i = 0; i < characters.size(); i++) {
            System.out.print(characters.get(i) + " ");
        }
    }
}
