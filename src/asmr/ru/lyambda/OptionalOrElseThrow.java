package asmr.ru.lyambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {
    public static class User {

        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException {
    }

    public static User orElseThrow(List<User> list, String login) {
        Optional<User> optional = search(list, login);
        return optional.orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogin().equals(login)) {
                user = Optional.of(list.get(i));
                break;
            }
        }
        return user;
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        User user = orElseThrow(users, "u4");
        System.out.println(user.getLogin());
    }
}
