package asmr.ru.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {
    public static class User {

        private String name;

        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
//        Map<String, Integer> map = users.stream().collect(Collectors.groupingBy(User -> User.getBills().))
        return Map.of();
    }

    public static void main(String[] args) {
        Bill b1 = new Bill(1);
        Bill b2 = new Bill(2);
        Bill b3 = new Bill(3);
        Bill b4 = new Bill(4);
        Bill b5 = new Bill(5);
        Bill b6 = new Bill(6);
        User u1 = new User("u1", List.of(b1));
        User u2 = new User("u2", List.of(b2, b3));
        User u3 = new User("u3", List.of(b4, b5, b6));
        List<User> users = List.of(u1, u2, u3);
        Map<String, Integer> out = summing(users);
        for (Map.Entry<String, Integer> entry : out.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
