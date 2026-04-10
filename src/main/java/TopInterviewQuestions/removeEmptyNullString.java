package TopInterviewQuestions;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class removeEmptyNullString {
    public static void main(String[] args) {
        String [] arr = {"Java",""," ",null,"is","cool"};

        String [] newArray = Arrays.stream(arr)
                .filter(Objects::nonNull)
                .filter(x -> !x.isBlank())
                .toArray(String[] :: new);

        System.out.println(Arrays.toString(newArray));
    }
}
