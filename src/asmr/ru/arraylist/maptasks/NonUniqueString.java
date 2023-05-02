package asmr.ru.arraylist.maptasks;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        map.put(strings[0], false);
        for (int i = 1; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.computeIfPresent(strings[i], (key, value) -> value = true);
            } else {
                map.put(strings[i], false);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] data = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> rsl = NonUniqueString.checkData(data);
        for (Map.Entry<String, Boolean> entry : rsl.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
