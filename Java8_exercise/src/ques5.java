import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ques5 {
    public static void main(String args[]) {
        Consumer consume = (e) -> {
            System.out.println(e);
        };

        Supplier supply = () -> {
            return 20;
        };

        Function<Integer, Integer> function = (e) -> {
            return e * 3;
        };

        Predicate<String> predicate = (e) -> {
            return e.length() > 5;
        };

        System.out.print("Consumer interface consumes a value: ");
        consume.accept(15);

        System.out.println("Supplier returns a value: " + supply.get());

        System.out.println("Function...Triple the given value: " + function.apply(4));

        System.out.println("Predicate...Check if string length is greater than 5: " + predicate.test("greater"));
    }
}
