import java.util.Arrays;
import java.util.List;

public class ques9 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Even numbers from list are: ");
        list
                .stream()
                .filter(e->e%2==0)
                .forEach(System.out::println);
    }
}
