package javaAssessment1;

public class ques6 {
    public static void main(String args[]) {
        int array1[] = {2, 3, 3, 2, 9};

        System.out.print("Elements of array are: ");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+ ",");
        }
        int result = array1[0];
        for (int j=1;j<array1.length;j++){
            result=result^array1[j];
        }
        System.out.println("\nElement not repeated in array is: "+result);
    }
}
