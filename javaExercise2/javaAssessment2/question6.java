package javaAssessment2;

public class question6 {
    public static void main(String args[]) {
        int x = 0;
        int y[] = {1, 2, 3, 4};
        try {
            y[5] = 43 / 0;
        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("Exception caught inside try block: " + arr);
        } catch (ArithmeticException ae) {
            System.out.println("Exception caught inside try block: " + ae);
        }
        finally {
            System.out.println("this finally block is always executed");
        }

    }
}
