package javaAssessment2;
class Parent extends Grandparent {
    {
        System.out.println("instance - parent");
    }
    public Parent() {
        System.out.println();
    }
    static {
        System.out.println("static - parent");
    }
}
class Grandparent {
    static {
        System.out.println("static - grandparent");
    }
    {
        System.out.println("instance - grandparent");
    }
    public Grandparent() {
        System.out.println();
    }
}
class Child extends Parent {
    public Child() {
        System.out.println();
    }
    static {
        System.out.println("static - child");
    }
    {
        System.out.println("instance - child");
    }
}
public class question12 {
    public static void main(String args[]){
        Child newChild = new Child();
    }}
