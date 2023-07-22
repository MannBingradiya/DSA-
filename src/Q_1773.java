import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_1773 {
    public static void main(String[] args) {
//        String[][] item = {{"phone","blue","pixel"},{"computer","silver","lenovo"}, {"phone","gold","iphone"}};
        List<List<String>> item = new ArrayList<>();

        List<String> type = new ArrayList<>();
        type.add("phone");
        type.add("compter");
        type.add("phone");
        item.add(type);

        List<String> color = new ArrayList<>();
        color.add("blue");
        color.add("silver");
        color.add("gold");
        item.add(color);


        List<String> name = new ArrayList<>();
        name.add("pixel");
        name.add("lenovo");
        name.add("iphone");
        item.add(name);


        String ruleKey = "type", ruleValue = "phone";
        System.out.println(countMatches(item,ruleValue,ruleKey));
    }

    private static int countMatches(List<List<String>> item, String ruleValue, String ruleKey) {
        int counter = 0;

            for (int j = 0; j < item.size(); j++) {
                if ( item.get(j).get(0).equals(ruleValue)){
                    counter++;
                }else if(item.get(j).get(1).equals(ruleValue)){
                    counter++;
                }else if( item.get(j).get(2).equals(ruleValue)){
                    counter++;
                }
            }
        return counter;
    }
}
