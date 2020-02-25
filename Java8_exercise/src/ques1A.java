interface demo {
    boolean greater(int x, int y);
}

public class ques1A {
    public static void main(String args[]) {
        demo d1 = (x, y) -> {
            if (x > y)
                return true;
            else
                return false;
        };
        System.out.println(d1.greater(5, 3));
    }
}
