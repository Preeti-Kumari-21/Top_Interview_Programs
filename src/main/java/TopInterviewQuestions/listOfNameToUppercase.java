package TopInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listOfNameToUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("preeti", "vasu", "kp", "avisha", "shushant", "prashant", "archana", "bina", "ram baran");
        list.stream().map(String::toUpperCase).toList().forEach(System.out::println);
    }
}
