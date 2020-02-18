package javaAssessment1;

public class ques4 {
    public static void main(String args[]) {
        String s1 = "This is a Number 50 & also fifty @@@@";
        char[] charArray = s1.toCharArray();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int specialCharacter = 0;

        int totalChars = s1.length();
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isUpperCase(charArray[i])) {
                upper++;
            } else if (Character.isLowerCase(charArray[i])) {
                lower++;
            } else if (Character.isDigit(charArray[i])) {
                digit++;
            } else {
                specialCharacter++;
            }
        }
        System.out.println("String is :" + s1);
        System.out.println("Percentage of upper case letters: " + (upper * 100) / totalChars + "%");
        System.out.println("Percentage of lower case letters: " + (lower * 100) / totalChars + "%");
        System.out.println("Percentage of digits : " + (digit * 100) / totalChars + "%");
        System.out.println("Percentage of special characters : " + (specialCharacter * 100) / totalChars + "%");
    }
}

