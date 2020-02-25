interface myInterface1 {
    default void display() {
        System.out.println("This is a default method of first interface");
    }
}

interface myInterface2 {
    default void display() {
        System.out.println("This is a default method of second interface");
    }
}

public class ques7 implements myInterface1,myInterface2 {
    public void display(){
        myInterface1.super.display();
        myInterface2.super.display();
    }
    public static void main(String args[]) {
        ques7 obj1 = new ques7();
        obj1.display();
    }
}
