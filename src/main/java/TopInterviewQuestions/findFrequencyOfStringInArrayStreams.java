package TopInterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findFrequencyOfStringInArrayStreams {
    public static void main(String[] args) {
        List<String> list = List.of("apple","banana","apple","orange","banana","apple");
        //find frequency
        Map<String,Long> map = list.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                Collectors.counting()
        ));
        System.out.println("The frequency of each strings = "+map);

        //Most frequent element
        String maxWord = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println("The max word is "+maxWord);

        list.stream()
                .collect(Collectors.groupingBy(word -> word,Collectors.counting()
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String,Long> comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
