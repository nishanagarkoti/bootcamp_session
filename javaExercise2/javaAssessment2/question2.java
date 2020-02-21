package javaAssessment2;

public class question2 {
    public static void main(String args[]){
        String s1="nisha";
        System.out.println("Unsorted String: "+s1);
        char temp;
        char[] alphabets = s1.toCharArray();
        for (int j=0;j<alphabets.length;j++){
            for (int i=0;i<alphabets.length;i++){
                if (alphabets[i]>alphabets[j]){
                    temp=alphabets[j];
                    alphabets[j]=alphabets[i];
                    alphabets[i]=temp;
                }
            }
        }
        System.out.println("\nSorted String: ");
        for (int k=0;k<alphabets.length;k++)
            System.out.println(alphabets[k]);
    }
}
