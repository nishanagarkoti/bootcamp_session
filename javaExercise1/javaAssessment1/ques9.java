package javaAssessment1;

enum House {
    oneBHK(15000), twoBHK(20000), threeBHK(30000), fourBHK(50000);
    private int price;

    House(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class ques9 {
    public static void main(String args[]) {
        System.out.println("House prices:");
        for (House H : House.values())
            System.out.println(H + " cost is " + H.getPrice() + " rupees.");
    }
}



