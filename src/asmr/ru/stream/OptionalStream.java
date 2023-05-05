package asmr.ru.stream;

import java.util.List;

public class OptionalStream {
    public static class PhoneNumber {
        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }
        public String getPhone() {
            return phone;
        }
    }

    public static class User {
        private int id;
        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }
        public int getId() {
            return id;
        }
        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {

        return List.of(new PhoneNumber("123"));
    }

    public static void main(String[] args) {
        PhoneNumber ph1 = new PhoneNumber("+7 123 345 61 91");
        PhoneNumber ph2 = new PhoneNumber("+7 123 345 61 92");
        PhoneNumber ph3 = new PhoneNumber("+7 123 345 61 93");
        PhoneNumber ph4 = new PhoneNumber("+1 123 345 61 91");
        PhoneNumber ph5 = new PhoneNumber("+2 123 345 61 91");
        PhoneNumber ph6 = new PhoneNumber("+3 123 345 61 91");
        User u1 = new User(1, List.of(ph1));
        User u2 = new User(2, List.of(ph2));
        User u3 = new User(3, List.of(ph3, ph4, ph5));
        User u4 = new User(3, List.of(ph6));
    }
}
