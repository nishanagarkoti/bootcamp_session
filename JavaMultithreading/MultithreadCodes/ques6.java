
package MultithreadCodes;
class sampleThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread executing " + i);
        }
    }
}
public class ques6 {
    public static void main(String args[]) {
        sampleThread t1 = new sampleThread();
        sampleThread t2 = new sampleThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}