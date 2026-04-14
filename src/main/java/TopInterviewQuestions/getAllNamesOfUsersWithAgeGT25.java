package TopInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class getAllNamesOfUsersWithAgeGT25 {

    public static void main(String[] args) {
        List<Users> users = Arrays.asList (
                new Users("Preeti", 34),
                new Users("KP", 38),
                new Users("Vasu", 4),
                new Users("Hare Krishna", 4000)
        );

        List<String> ans = findNameOfUsersAgeGT25(users);
        ans.forEach(System.out::println);
    }

    private static List<String> findNameOfUsersAgeGT25(List<Users> users) {
        List<String> ans = users.stream()
                .filter(u -> u.getAge() > 25)
                .map(Users :: getName)
                .collect(Collectors.toList());

        return ans;
    }
}
