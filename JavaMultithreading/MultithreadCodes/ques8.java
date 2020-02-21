package MultithreadCodes;

import java.util.concurrent.Semaphore;

public class ques8 {
    int count = 0;
    Semaphore s = new Semaphore(1);

    public static void main(String[] args) {
        ques8 q1 = new ques8();
        Thread t1 = new Thread() {
            public void run() {
                try {
                    q1.func();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                try {
                    q1.func();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t2.start();
    }

    private void func() throws InterruptedException {
        try {
            s.acquire();
            System.out.println( "Lock Acquired on "+Thread.currentThread().getName() );
            count++;
            System.out.println("Count is: " + count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.release();
            System.out.println("Lock Released on "+Thread.currentThread().getName() );
        }


    }
}