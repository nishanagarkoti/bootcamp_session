package MultithreadCodes;

class sample2 implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++)
            System.out.println("in thread " + i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ques2b {
    public static void main(String args[]) {
        Thread T1 = new Thread(new sample2());
        T1.start();
        Thread T2 = new Thread(new sample2());
        T2.start();
    }}