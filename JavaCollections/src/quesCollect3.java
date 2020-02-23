import java.util.HashMap;
import java.util.Map;

public class quesCollect3 {
    static void countCharacter(String s1){
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        char stringArray[] = s1.toCharArray();
        for (char ch:stringArray) {
            if (hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for (Map.Entry entry:hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
    public static void main(String args[]){
        String str = "Collections";
        countCharacter(str);
    }
}
