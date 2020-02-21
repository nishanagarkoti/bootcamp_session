package MultithreadCodes;

class sample extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}
public class ques2 {
    public static void main(String args[]) {
        sample th1 = new sample();
        th1.start();
        sample th2 = new sample();
        th2.start();
    }}