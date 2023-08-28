package InterviewPrep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMatches {
    private static final Map<String, Integer> indexes = Map.of("type", 0, "color", 1, "name", 2);
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = indexes.get(ruleKey);
        for (List<String> item : items) {
             if (item.get(index).equals(ruleValue))
                 count++;
        }
        return count;
    }


    public static void main(String[] args) {
        List<String> item1 = List.of("phone","blue","pixel");
        List<String> item2 = List.of("computer","silver","lenovo");
        List<String> item3 = List.of("phone","gold","iphone");
        List<List<String>> items = List.of(item1, item2, item3);

        System.out.println(countMatches(items, "color", "silver"));
    }
}
