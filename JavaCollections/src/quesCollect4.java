import java.util.*;

public class quesCollect4 {

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("three", 30);
        hm.put("one", 10);
        hm.put("two", 20);
        hm.put("five", 50);
        hm.put("four", 40);

        System.out.println(hm);

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Sorting elements of HashMap by value\n");
        for (Map.Entry<String, Integer> items : list) {
            System.out.println("Key is:" + items.getKey() + "\t\t Value is: " + items.getValue());

        }
    }
}