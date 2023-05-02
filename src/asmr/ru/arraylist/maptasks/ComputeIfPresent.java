package asmr.ru.arraylist.maptasks;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (Map.Entry <Integer, String> entry : name.entrySet()) {
            name.computeIfPresent(entry.getKey(), (key, value) -> name.get(key) + " " + surname.get(key));
        }
        return name;
    }
}
