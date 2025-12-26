package Question_104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class DoTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
}

public class MultiThreadExecutorService {
    public static void main(String[] args) {

        // 3 threads in pool
        ExecutorService service = Executors.newFixedThreadPool(3);

        // submit 10 tasks
        for (int i = 0; i < 10; i++) {
            DoTask task = new DoTask();
            service.submit(task);
        }

        // shutdown AFTER submitting all tasks
        service.shutdown();

        try {
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Emergency Shutdown");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            service.shutdownNow();
        }
    }
}
