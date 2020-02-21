package MultithreadCodes;
class demo1 extends Thread{
    public static volatile int count=0;
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Updating count ");
        try {
            count++;
            System.out.println(count);
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ques1 {
    public static void main(String args[]){
    demo1 d1 = new demo1();
    demo1 d2 = new demo1();
    d1.start();
    d2.start();
    }
}
