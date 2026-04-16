package TopInterviewQuestions;

import java.util.*;

public class findFrequencyOfStringInArray {
    public static void main(String[] args) {
        List<String> list = List.of("apple","banana","apple","orange","banana","apple");
        //find frequency of each word
        //lets do it using old java loops

        Map<String,Integer> map = new HashMap<>();
        for(String s : list){
            if(map.containsKey(s)){
                map.put(s,map.getOrDefault(s,0)+1);
            }
            else{
                map.put(s,1);
            }
        }
        System.out.println("The frequency of words are = "+map);

        //sort the element results
        //we cannot sort the map directly so convert the map to list
        List<Map.Entry<String, Integer>> entryListSortedByValue = new ArrayList<>(map.entrySet());

        //sort based on value using comparator
        Collections.sort(entryListSortedByValue,new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> e1 , Map.Entry<String,Integer> e2) {
                return e1.getValue() - e2.getValue();
            }
        });
        System.out.println("The frequency of words are sorted in ASC order by value= "+entryListSortedByValue);

        //sort based on key using comparator
        List<Map.Entry<String,Integer>> entryListSortedByKey = new ArrayList<>(map.entrySet());
        Collections.sort(entryListSortedByKey, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) {
                return e1.getKey().compareTo(e2.getKey());
            }
        });
        System.out.println("The frequency of words are sorted in ASC order by key= "+entryListSortedByKey);

        //Find max

        String maxWord = null;
        int maxCount = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        System.out.println("maxword = "+maxWord+" maxcount = "+maxCount);
    }
}
