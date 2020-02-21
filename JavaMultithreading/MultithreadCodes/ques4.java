package MultithreadCodes;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.lang.Thread.sleep;

public class ques4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = new Runnable() {
            public void run() {
                System.out.println("Performing function to print odd number");
                System.out.println("Starting " + Thread.currentThread().getName());
                try {
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 != 0)
                            System.out.println("Odd: " + i);
                        sleep(100);
                    }
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };
        Runnable task2 = new Runnable() {
            public void run() {
                System.out.println("Performing function to print even number");
                System.out.println("Starting " + Thread.currentThread().getName());
                try {
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 == 0)
                            System.out.println("Even: " + i);
                        sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.shutdown();
        executorService.shutdown();
    }
}