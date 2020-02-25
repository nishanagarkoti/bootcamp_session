interface demoB {
    int increment(int x);
}

public class ques1B {
    public static void main(String args[]) {
        demoB d1 = (x) -> {
            return x + 1;
        };
        System.out.println(d1.increment(6));
    }
}
