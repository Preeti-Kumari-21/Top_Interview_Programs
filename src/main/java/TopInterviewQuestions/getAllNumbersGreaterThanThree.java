package TopInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class getAllNumbersGreaterThanThree {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,-1,-8,17);

        arr.stream().filter(n -> n>3).forEach(System.out::println);
    }
}
