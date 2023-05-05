package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterObject {
    public static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static List<User> filter(List<User> users) {
            return users.stream()
                    .filter(u -> u.getAge() > 18)
                    .filter(u -> u.getName().startsWith("B"))
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<FilterObject.User> users = List.of(
                new FilterObject.User("Ivan", 20),
                new FilterObject.User("Boris", 19),
                new FilterObject.User("Benjamin", 18)
        );
        List<User> out = filter(users);
        System.out.println(out.toString());
    }
}
