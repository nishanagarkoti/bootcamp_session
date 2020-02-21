package javaAssessment2;
class a {
    void display(){
        System.out.println("This is class A");
    }
}

public class question3 {
    public static void main(String args[]){
        try{
            Class.forName("question3");
            System.out.println("Class found successfully");
        }catch (ClassNotFoundException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
       a obj1 = new a();
        obj1.display();
    }
}


