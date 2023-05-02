package asmr.ru.arraylist.maptasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        List<String> chars = new ArrayList<>();
        Map<String, Integer> charStr = new TreeMap<>();
        Integer max = Integer.MIN_VALUE;
        // Заполним ArrayList
        String[] arr = String.valueOf(str).split("");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                chars.add(arr[i].toLowerCase());
            }
        }
        // Вставим первый символ, чтобы мапа была непустой
        charStr.put(chars.get(0), 1);
        for (int i = 1; i < chars.size(); i++) {
            //Пишем в TreeMap
            if (charStr.containsKey(chars.get(i))) {
                charStr.computeIfPresent(chars.get(i), (key, value) -> value = value + 1);
            } else {
                charStr.putIfAbsent(chars.get(i), 1);
            }
        }
        char rsl = ' ';
        for (Map.Entry<String, Integer> entry : charStr.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                char[] strChar = entry.getKey().toCharArray();
                rsl = strChar[0];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String str = "Мой дядя самых честных правил "
                + "Когда не в шутку занемог "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог "
                + "Его пример другим наука "
                + "Но боже мой какая скука "
                + "С больным сидеть и день и ночь "
                + "Не отходя ни шагу прочь "
                + "Какое низкое коварство "
                + "Полуживого забавлять "
                + "Ему подушки поправлять "
                + "Печально подносить лекарство "
                + "Вздыхать и думать про себя "
                + "Когда же черт возьмет тебя";
        char rsl = MostUsedCharacter.getMaxCount(str);
        System.out.println(rsl);
    }
}
