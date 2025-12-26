package Question_99;

public class HelloThread extends Thread {
    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello From Thread " + threadNumber + " , i = " + (i+1) + " , " + Thread.currentThread().getName());
        }
    }
}