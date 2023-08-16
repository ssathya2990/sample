import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        Test1 test1 = new Test1();
        List<String> newList = new ArrayList<String>();
        try {
            newList = test1.sample1(list);
        } catch(Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
        Map<String, String> mapOfRuleErrorDescription = new HashMap<String, String>();
        mapOfRuleErrorDescription.put("TCE006", "TCE005");
        if(mapOfRuleErrorDescription.containsKey("TCE006") && mapOfRuleErrorDescription.containsValue("TCE006")) {
        }
        for (Map.Entry<String, String> mapEntry : mapOfRuleErrorDescription.entrySet()) {

        }
        System.out.println("List: " + list);
    }
}