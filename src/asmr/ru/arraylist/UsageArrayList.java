package asmr.ru.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Sergey");
        list.add("Misha");
        for (String name : list) {
            System.out.println(name);
        }
        list.set(0, "Petr");
        System.out.println("--------------------");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("---------------------");
        list.remove(0);
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("---------------------");
        list.remove("Sergey");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("---------------------");


    }
}
