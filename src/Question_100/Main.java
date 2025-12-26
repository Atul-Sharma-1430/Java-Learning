package Question_100;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        ThreadState t1 = new ThreadState();
        System.out.println("Thread Created: " + t1.getState());

        t1.start();

        t1.join();  // throws InterruptedException 

        System.out.println("Thread Finished: " + t1.getState());
    }


    // Output: 
    // Thread Created: NEW
    // From Inside Run RUNNABLE
    // Thread Finished: TERMINATED
}