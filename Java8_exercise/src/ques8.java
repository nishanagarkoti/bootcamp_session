interface first{
    default void show(){
        System.out.println("First method show");
    }
    default void greet(){
        System.out.println("First method greet");
    }
}
interface second{
    default void display(){
        System.out.println("Second method display");
    }
    default void greet(){
        System.out.println("Second method greet");
    }
}
public class ques8 implements first,second{
    public void greet(){
        first.super.greet();
        second.super.greet();
    }

    public static void main(String args[]){
        ques8 q1 = new ques8();
        q1.show();
        q1.greet();
        q1.display();
    }
}

