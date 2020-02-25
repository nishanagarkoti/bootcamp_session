interface demoC {
    String stringConcat(String s1, String s2);
}

public class ques1C {
    public static void main(String args[]) {
        demoC d1 = (s1, s2) -> {
            return s1 + s2;
        };
        System.out.println(d1.stringConcat("good", "bye"));
    }
}
