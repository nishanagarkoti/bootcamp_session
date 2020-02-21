package MultithreadCodes;
import java.util.concurrent.*;

class Product implements Callable<Integer> {
    public Integer call() throws Exception {
        Thread.sleep(200);
        return table();
    }
    private Integer table() {
        int num = 2;
        int result = 1;
        System.out.println("Doubling Numbers");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
            result = num * num;
        }
        return result;
    }
}
public class ques7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> fut = executorService.submit(new Product());
        Integer answer = fut.get();
        executorService.shutdown();
    }
}