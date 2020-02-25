interface demoD {
    String upperCase(String s1);
}

public class ques1D {
    public static void main(String args[]) {
        demoD d1 = (s1) -> {
            return s1.toUpperCase();
        };
        System.out.println(d1.upperCase("hello"));
    }
}
