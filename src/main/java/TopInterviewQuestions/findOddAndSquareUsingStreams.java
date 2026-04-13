package TopInterviewQuestions;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findOddAndSquareUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .filter(n -> n%2 != 0)
                .map(n -> n * n)
                .toList()
                .forEach(System.out::println);
    }
}
