package TopInterviewQuestions;

import org.apache.catalina.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GetFirstUserWithAgeGT25 {
    public static void main(String[] args) {
        List<Users> users = Arrays.asList (
                new Users("Preeti", 34),
                new Users("KP", 38),
                new Users("Vasu", 4),
                new Users("Hare Krishna", 4000)
        );

        Optional<Users>  user = getFirstUsersAgeGreaterThan25Method(users);
        System.out.println(user);
    }

    private static Optional<Users> getFirstUsersAgeGreaterThan25Method(List<Users> users) {
        return users.stream().filter(u -> u.getAge() > 25).findFirst();
    }
}
