package asmr.ru.arraylist.maptasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        store.putIfAbsent(index, list);
    }

    public List<String> getValue(int index) {
        List<String> retVal = new ArrayList<>();
        if (!store.isEmpty()) {
            retVal = store.getOrDefault(index, retVal);
        }
        return retVal;
    }
}
