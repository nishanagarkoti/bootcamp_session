import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class ques10 {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Sum of element greater than 5 is: ");
        System.out.println(
                list
                        .stream()
                        .filter(e -> e > 5)
                        .collect(Collectors.summingInt(e -> e))
        );
    }
}
