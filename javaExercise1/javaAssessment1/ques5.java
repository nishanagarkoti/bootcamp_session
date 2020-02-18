package javaAssessment1;

public class ques5 {
    public static void main(String  args[]) {
        int ArrayOne[] = {1, 4, 5, 2, 7, 9};
        int ArrayTwo[] = {2, 3, 7, 11, 33, 73};
        System.out.println("Common elements between two arrays are: ");

        for(int i=0;i<ArrayOne.length;i++){
            for (int j=0;j<ArrayTwo.length;j++)
                if (ArrayOne[i] == ArrayTwo[j]) {
                    System.out.println(ArrayOne[i]);
                }
        }
    }
}
