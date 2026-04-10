package TopInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class missingElementFromArray {
    public static void main(String[] args) {

        int [] arr = {3,2,5,5,7,8,4,2,5,1,9};

        Set<Integer> set =  Arrays.stream(arr).boxed().collect(Collectors.toSet());
        List<Integer> missingInt = IntStream.rangeClosed(1,9).filter(i -> !set.contains(i)).boxed().toList();
        System.out.println(missingInt);
    }
}
