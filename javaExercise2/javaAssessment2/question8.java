package javaAssessment2;
import java.util.Scanner;

public class question8 {
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a word: ");
//        String word = sc.next();
//        while(!word.equals("done"))
//        {
//            if(word.charAt(0) == word.charAt(word.length() - 1))
//            {
//                System.out.println("First and last character are equal");
//            }
//            else
//            {
//                System.out.println("First and last character are not equal");
//            }
//            word = sc.next();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        do
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equal");
            }
            else
            {
                System.out.println("First and last character are not equal");
            }
            word = sc.next();
        }while(!word.equals("done"));
     }
}
