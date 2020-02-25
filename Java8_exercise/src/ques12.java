import java.util.Arrays;
import java.util.List;

public class ques12 {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("First even number greater than 3 is: ");
        System.out.println(
                list
                        .stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .findFirst()
                        .orElse(-1)
        );
    }
}
