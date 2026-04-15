package TopInterviewQuestions;

import java.util.List;

public class convertNamesToUppercaseFlatMap {
    public static void main(String[] args) {
        List<List<String>> names = List.of(
                List.of("preeti", "kumari1"),
                List.of("kumar","prashant"),
                List.of("alogonomy","allstate")
        );

        names.stream()
                .flatMap(list -> list.stream())
                .map(u->u.toUpperCase())
                .toList()
                .forEach(System.out::println);
    }
}
