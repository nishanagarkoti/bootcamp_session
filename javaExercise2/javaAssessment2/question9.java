package javaAssessment2;

interface Furniture {
    public void fireTest();

    public void stressTest();
}
abstract class Chair implements Furniture {
    public abstract void typeOfChair();
}
abstract class Table implements Furniture {
    public abstract void typeOfTable();
}
class woodenChair extends Chair {
    public void fireTest() {
        System.out.println("Fire testing failed on wooden chair");
    }

    public void stressTest() {
        System.out.println("Stress testing failed on wooden chair");
    }

    public void typeOfChair() {
        System.out.println("This is a wooden chair");
    }
}

class metalChair extends Chair {
    public void fireTest() {
        System.out.println("Fire testing passed on metal chair");
    }

    public void stressTest() {
        System.out.println("Stress testing passed on metal chair");
    }

    public void typeOfChair() {
        System.out.println("This is a metal chair");
    }
}

class woodenTable extends Table {

    public void fireTest() {
        System.out.println("Fire testing failed on wooden table");
    }

    public void stressTest() {
        System.out.println("Fire testing failed on wooden table");
    }

    public void typeOfTable() {
        System.out.println("This is a wooden table");
    }
}

class metalTable extends Table {

    public void fireTest() {
        System.out.println("Fire testing passed on metal table");
    }

    public void stressTest() {
        System.out.println("Fire testing passed on metal table");
    }

    public void typeOfTable() {
        System.out.println("This is metal table");
    }
}


public class question9 {
    public static void main(String args[]) {
        woodenChair wc = new woodenChair();
        wc.typeOfChair();
        wc.fireTest();
        wc.stressTest();

        woodenTable wt = new woodenTable();
        System.out.println("\n");
        wt.typeOfTable();
        wt.fireTest();
        wt.stressTest();

        metalChair metalCh = new metalChair();
        System.out.println("\n");
        metalCh.typeOfChair();
        metalCh.fireTest();
        metalCh.stressTest();

        metalTable mt = new metalTable();
        System.out.println("\n");
        mt.typeOfTable();
        mt.fireTest();
        mt.stressTest();
    }
}
