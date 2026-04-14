package TopInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class checkIfAnyUserIsGT30Age {
    public static void main(String[] args) {
        List<Users> users = Arrays.asList (
                new Users("Preeti", 34),
                new Users("KP", 38),
                new Users("Vasu", 4),
                new Users("Hare Krishna", 4000)
        );

        boolean ans = checkIfAnyUserIsGT30AgeMethod(users);
        System.out.println(ans);
    }

    private static boolean checkIfAnyUserIsGT30AgeMethod(List<Users> users) {
        return users.stream().anyMatch(u -> u.getAge() > 30);
    }
}
