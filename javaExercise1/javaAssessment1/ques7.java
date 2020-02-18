package javaAssessment1;
class one{
    static String firstName;
    static String LastName;
    static int age;
    static {
        firstName="Pallavi";
        LastName="Sharma";
        age=45;
        System.out.println("Static block is called to display name and age");
    }
}
public class ques7 {
    public static void main(String args[]){
        System.out.println("First name is = " +one.firstName);
        System.out.println("Last name is = " +one.LastName);
        System.out.println("Age is = " +one.age);
    }
}
