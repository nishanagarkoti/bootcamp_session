import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ques11 {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println("Average of elements after doubling them is: ");
        System.out.println(
                list
                        .stream()
                        .map(e -> e * 2)
                        .mapToInt(e -> e).average()
                        .orElse(-1)
        );
    }
}
