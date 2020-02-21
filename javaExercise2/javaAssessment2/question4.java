package javaAssessment2;

class sample {
    public static sample s = null;
    public String s1;

    private sample() {

    }

    public static sample getInstance() {
        if (s == null) {
            s = new sample();
        }
        return s;
    }

    protected static void methodPrint() {
        System.out.println("Method of singleton");
    }
}

class question4 {
    public static void main(String args[]) {
        sample obj1 = sample.getInstance();
        obj1.methodPrint();
    }
}
