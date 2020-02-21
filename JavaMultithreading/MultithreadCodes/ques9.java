package MultithreadCodes;


import java.util.concurrent.CountDownLatch;

public class ques9 {
    public static void main(String args[]) throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(3);
        latch_call one = new latch_call(1000,latch,"Thread 1");
        latch_call two = new latch_call(2000,latch,"Thread 2");
        latch_call three = new latch_call(4000,latch,"Thread 3");

        one.start();
        two.start();
        three.start();

        latch.await();;

        System.out.println(Thread.currentThread().getName()+" has finished");

    }
    static class latch_call extends Thread{
        private int delay;
        private CountDownLatch latch;

        public latch_call(int delay, CountDownLatch latch,String data){
            super(data);
            this.delay=delay;
            this.latch=latch;
        }
        public void run(){
            System.out.println(Thread.currentThread().getName()+ " has started");
            try {
                Thread.sleep(delay);
                latch.countDown();
                System.out.println(Thread.currentThread().getName()+ " has finished executing..");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
