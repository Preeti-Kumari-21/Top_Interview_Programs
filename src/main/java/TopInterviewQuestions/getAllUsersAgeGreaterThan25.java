package TopInterviewQuestions;

import org.apache.catalina.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class getAllUsersAgeGreaterThan25 {
    public static void main(String[] args) {
        List<Users> users = Arrays.asList (
                new Users("Preeti", 34),
                new Users("KP", 38),
                new Users("Vasu", 4),
                new Users("Hare Krishna", 100),
                new Users("Avisha", 25));

        List<Users> ans = findAllUsers(users);
        ans.forEach(System.out::println);
}

    private static List<Users> findAllUsers(List<Users> users) {
        List<Users> ans = users.stream().filter(user ->user.getAge() > 25).collect(Collectors.toList());
        return ans;
    }
    }
