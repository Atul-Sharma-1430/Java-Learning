package Question_100;

public class ThreadState extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("From Inside Run " + getState());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
