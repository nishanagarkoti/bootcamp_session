package javaAssessment2;

public class question7 {
    public static void main(String args[]){
        int seconds=754630;

        int days=seconds/(24*3600);
        int day1=seconds%(24*3600);
        int hours=day1/3600;
        int hour1=day1%3600;
        int minutes=hour1/60;
        int sec=hour1%60;
        System.out.println(seconds+" seconds is equal to: ");
        System.out.println(days+" "+"days  "+hours+" "+"hours  "+minutes+" "+"minutes  "+sec+" "+"seconds");
    }
}
