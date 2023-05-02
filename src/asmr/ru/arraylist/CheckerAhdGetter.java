package asmr.ru.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        List <String> temp = list;
        String retVal = "";
        if (!temp.isEmpty()) {
            retVal = list.get(0);
        }
        return retVal;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = CheckerAhdGetter.getElement(list);
        System.out.println(result);
    }
}
