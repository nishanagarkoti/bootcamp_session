interface myInterface {

    public void method1(String s1);

    default void display() {
        System.out.println("This is a default method");
    }
}

public class ques6B implements myInterface {
    @Override
    public void method1(String s1) {
        System.out.println(s1);
    }
    public static void main(String args[]) {
        ques6B obj1 = new ques6B();
        obj1.method1("Called method 1");
        obj1.display();
    }
}
