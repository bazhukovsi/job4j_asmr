package asmr.ru.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DistinctForObject {
    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static List<User> distinct(List<User> users) {
        return  users.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        DistinctForObject.User user1 = new DistinctForObject.User("A", 20);
        DistinctForObject.User user2 = new DistinctForObject.User("B", 20);
        DistinctForObject.User user3 = new DistinctForObject.User("A", 21);
        DistinctForObject.User user4 = new DistinctForObject.User("A", 20);
        List<User> out = distinct(List.of(user1, user2, user3, user4));
        for (int i = 0; i < out.size(); i++) {
            System.out.println(out.get(i).toString());
        }
    }
}
