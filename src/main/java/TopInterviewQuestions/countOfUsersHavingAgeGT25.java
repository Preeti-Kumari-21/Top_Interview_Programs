package TopInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class countOfUsersHavingAgeGT25 {
    public static void main(String[] args) {
        List<Users> users = Arrays.asList (
                new Users("Preeti", 34),
                new Users("KP", 38),
                new Users("Vasu", 4),
                new Users("Hare Krishna", 4000)
        );

        long ans = countOfUsersHavingAgeGT25Method(users);
        System.out.println(ans);
    }

    private static long countOfUsersHavingAgeGT25Method(List<Users> users) {
        return users.stream()
                .filter(u -> u.getAge() > 25)
                .count();
    }
}
