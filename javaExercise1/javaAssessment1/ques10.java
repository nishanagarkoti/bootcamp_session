package javaAssessment1;

class sample {
    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    static float multiply(float a, float b) {
        float result = a * b;
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    static String concatStrings(String s1, String s2) {
        String result = s1 + s2;
        return result;
    }

    static String concatStrings(String s1, String s2, String s3) {
        String result = s1 + s2 + s3;
        return result;
    }
}

class ques10 {
    public static void main(String args[]) {
        System.out.print("Sum of integer a and integer b is: ");
        System.out.println(sample.add(5, 4));

        System.out.print("Sum of double a and double b is: ");
        System.out.println(sample.add(4.5, 7.2));

        System.out.print("Multiplication of float a and float b is: ");
        System.out.println(sample.multiply(20.56f, 7.26f));

        System.out.print("Multiply of integer a and integer b is: ");
        System.out.println(sample.multiply(4, 2));

        System.out.print("Concatenating 2 strings: ");
        System.out.println(sample.concatStrings("Hello", "Nisha"));

        System.out.print("Concatenating 3 strings: ");
        System.out.println(sample.concatStrings("Bye", "Nisha", "Nagarkoti"));
    }
}


