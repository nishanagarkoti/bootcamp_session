package javaAssessment2;

public class question5 implements Cloneable {
    int eid;
    String name;

    question5(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            question5 e1 = new question5(101, "Nisha");
            question5 e2 = (question5) e1.clone();
            System.out.println("Emp1: " + e1.eid + " " + e1.name);
            System.out.println("Emp2: " + e2.eid + " " + e2.name);
        } catch (CloneNotSupportedException c) {
            System.out.println("Not Supported");
        }
    }
}