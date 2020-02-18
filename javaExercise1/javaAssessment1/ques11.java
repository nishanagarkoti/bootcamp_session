package javaAssessment1;

class Bank{
    int rateOfInterest;
    void getBankDetails(){
        System.out.println("Rate of interest is: "+rateOfInterest+" %");
        System.out.println("Types of account are: Current and Saving\n");
    }
}

class SBI extends Bank{
    @Override
    void getBankDetails() {
        rateOfInterest=5;
        System.out.println("\tSBI BANK DETAILS");
        super.getBankDetails();
    }
}

class BOI extends Bank{
    @Override
    void getBankDetails() {
        rateOfInterest=6;
        System.out.println("\tBOI BANK DETAILS");
        super.getBankDetails();
    }
}
class ICICI extends Bank{
    @Override
    void getBankDetails() {
        rateOfInterest=7;
        System.out.println("\tICICI BANK DETAILS");
        super.getBankDetails();
    }
}

public class ques11 {
    public static void main(String args[]){
        SBI s1 = new SBI();
        s1.getBankDetails();

        BOI b1 = new BOI();
        b1.getBankDetails();

        ICICI I1 = new ICICI();
        I1.getBankDetails();
    }
}
