package javaAssessment1;

public class ques3 {
    public static void main(String args[]){
        String s1 = "Uttarakhand";
        System.out.println("String is: "+s1);
        int count=s1.length()-s1.replace("a","").length();
        System.out.println("Number of occurrence of a "+count);
    }
}
