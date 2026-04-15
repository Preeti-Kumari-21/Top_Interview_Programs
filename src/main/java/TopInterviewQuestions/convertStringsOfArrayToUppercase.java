package TopInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertStringsOfArrayToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("preeti", "kumari", "alogonomy", "allstate");
        names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
