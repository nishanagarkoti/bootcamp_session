interface Calculate {
    int method(int a, int b);
}

public class ques3 {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Calculate c = new ques3()::add;
        System.out.println("Adding 2 numbers: " + c.method(2, 4));
        Calculate c1 = new ques3()::subtract;
        System.out.println("Subtracting 2 numbers: " + c1.method(10, 3));
        Calculate c3 = ques3::multiply;
        System.out.println("Product of 2 numbers: " + c3.method(4, 2));
    }
}