package asmr.ru.arraylist.telsprav;

import java.util.List;

public class TestPhonDict {
    public static void main(String[] args) {
        List <Person> list;
        PhoneDict phoneDict = new PhoneDict();
        phoneDict.add(new Person("Ivan", "Ivanov", "911", "Moscow"));
        phoneDict.add(new Person("Petr", "Petrov", "912", "SPB"));
        phoneDict.add(new Person("Vasya", "Ivanov", "913", "Segezha"));
        phoneDict.add(new Person("Kolya", "Ivanov", "918", "Spb"));
        list = phoneDict.viewAll();
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person.getCity());
    }
}
