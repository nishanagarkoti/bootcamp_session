interface sample2 {
    int sum(int x, int y);
}

public class ques2 {
    public static void main(String agrs[]) {
        sample2 s1 = (x, y) -> {
            System.out.println("Value of x is: " + x);
            System.out.println("Value of y is: " + y);
            return x + y;

        };

        System.out.println("Sum of x and y: " + s1.sum(4, 6));
    }
}
