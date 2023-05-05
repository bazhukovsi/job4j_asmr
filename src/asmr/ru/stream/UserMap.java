package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserMap {
    public static class User {
        private final int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> map(List<Integer> ages) {
        return ages.stream().map(User::new).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> ages = List.of(1, 2);
        List<User> result = map(ages);
        for (User user : result) {
            System.out.println("Возраст пользователя: " +user.getAge() + " год(года)");
        }
    }
}
