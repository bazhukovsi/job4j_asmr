package asmr.ru.arraylist.maptasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Merge {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            if (names.containsKey(i + 1)) {
                int finalI = i;
                names.merge(i + 1, users.get(i).getSurname(), (oldV, newV) -> oldV + " " + users.get(finalI).getSurname());
            } else {
                names.putIfAbsent(i + 1, users.get(i).getName() + " " + users.get(i).getSurname());
            }
        }
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return names;
    }

    public static class User {
        private final int id;
        private final String name;
        private final String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "name1", 2, "name2"));
        List<User> users = List.of(
                new User(1, "name1", "surname1"),
                new User(2, "name2", "surname2"),
                new User(3, "name3", "surname3"),
                new User(4, "name4", "surname4")
        );
        Map<Integer, String> rsl = Merge.collectData(names, users);
    }
}
