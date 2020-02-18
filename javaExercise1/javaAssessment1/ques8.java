package javaAssessment1;

import java.lang.*;

public class ques8 {
    public static void main(String args[]) {
        String s1 = "javaExercise";
        String reverseStr = new StringBuffer(s1).reverse().toString();
        System.out.println("Original String is: " + s1);
        System.out.println("Reversed string is: " + reverseStr);

        StringBuffer deleteStr = new StringBuffer(reverseStr);
        deleteStr.delete(4, 9);
        System.out.println("Reversed string without characters from index 4 to index 9: " + deleteStr);


    }
}
