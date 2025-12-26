package Question_101;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintingThread t1 = new PrintingThread(1);
        PrintingThread t2 = new PrintingThread(2);
        PrintingThread t3 = new PrintingThread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
    
}
