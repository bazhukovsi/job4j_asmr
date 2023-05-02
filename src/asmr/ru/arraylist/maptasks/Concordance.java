package asmr.ru.arraylist.maptasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        List<Integer> integers = new ArrayList<>();
        char[] characters = s.toCharArray();
        char temp;
        for (int i = 0; i < characters.length; i++) {
            integers.clear();
            temp = characters[i];
            if (temp == ' ' || temp == '\0') {
                continue;
            }
            integers.add(i);
            characters[i] = '\0';
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[j] == temp && characters[j] != '\0') {
                    integers.add(j);
                    characters[j] = '\0';
                }
            }
            rsl.put(temp, new ArrayList<>(integers));
        }
        return rsl;
    }

    public static void main(String[] args) {
        String str = "Hello World hello world";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        for (Map.Entry<Character, List<Integer>> entry : rsl.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map<Character, List<Integer>> expected = Map.of(
                'r', List.of(8, 20),
                'd', List.of(10, 22),
                'e', List.of(1, 13),
                'W', List.of(6),
                'w', List.of(18),
                'H', List.of(0),
                'h', List.of(12),
                'l', List.of(2, 3, 9, 14, 15, 21),
                'o', List.of(4, 7, 16, 19)
        );
    }
}
