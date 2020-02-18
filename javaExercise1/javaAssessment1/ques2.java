package javaAssessment1;

public class ques2 {
    public static void main(String args[]) {
        int count;
        String s1 = "This is java exercise question i am doing exercise question number two";
        s1 = s1.toLowerCase();
        String characters[] = s1.split(" ");

        System.out.println("Repeated words in string are: ");

        for (int i = 0; i < characters.length; i++) {
            count = 1;
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i].equals(characters[j])) {
                    count++;
                    characters[j] = "0";
                }
            }

            if (count > 1 && characters[i] != "0")
                System.out.println(characters[i] + "- " + count);
        }
    }
}
