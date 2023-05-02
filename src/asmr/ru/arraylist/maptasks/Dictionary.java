package asmr.ru.arraylist.maptasks;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        List<String> dict = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (!rsl.containsKey(strings[i].substring(0, 1))) {
                // Добавляем в Map
                dict.clear();
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String temp = iterator.next();
                    if (strings[i].substring(0, 1).equals(temp.substring(0, 1))) {
                        dict.add(temp);
                    }
                }
                rsl.putIfAbsent(strings[i].substring(0, 1), new ArrayList<>(dict));
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = {"two", "three", "four", "five", "six", "seven"};
        Map<String, List<String>> rsl = Dictionary.collectData(data);
        for (Map.Entry<String, List<String>> entry : rsl.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
