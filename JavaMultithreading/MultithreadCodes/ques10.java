package MultithreadCodes;
public class ques10 {
    public static Object LockItem1 = new Object();
    public static Object LockItem2 = new Object();

    public static void main(String args[]) {
        threadOne t1 = new threadOne();
        threadTwo t2 = new threadTwo();

        t1.start();
        t2.start();
    }

    private static class threadOne extends Thread {
        public void run() {
            synchronized (LockItem1) {
                System.out.println("ThreadOne have lock 1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("threadOne waiting for lock 2");

                synchronized (LockItem2) {
                    System.out.println("ThreadOne have lock 1 and 2");
                }
            }
        }
    }

    private static class threadTwo extends Thread {
        public void run() {
            synchronized (LockItem2) {
                System.out.println("ThreadTwo have lock 2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("threadTwo waiting for lock 1");

                synchronized (LockItem1) {
                    System.out.println("Threadtwo have lock 1 and 2");
                }
            }
        }
    }
}