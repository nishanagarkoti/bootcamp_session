package javaAssessment2;

public class question5b {
    int eid;
    String name;

    question5b(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }
    question5b(question5b q) {
        eid = q.eid;
        name = q.name;
    }

    public static void main(String[] args) {
        question5b e1 = new question5b(101, "Nisha Nagarkoti");
        question5b e2 = new question5b(e1);
        System.out.println("Emp1: " + e1.eid + " " + e1.name);
        System.out.println("Emp2: " + e2.eid + " " + e2.name);
    }
}