package Question_101;

public class PrintingThread extends Thread {

    private final int threadNumber;

    public PrintingThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Starting  , " + threadNumber + "\n"  );
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " Ending  , " + threadNumber + "\n"  );
    }
}
