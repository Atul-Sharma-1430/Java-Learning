package Question_104;

public class DoTask implements Runnable {

    @Override
    public void run() {

        Thread current = Thread.currentThread();
        System.out.println(current.getName() + " Started.");
        System.out.printf("Current Thread: %s%n", current.getName());

        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt
            throw new RuntimeException(e);
        }

        System.out.println(current.getName() + " Ends.");
    }

    private int getRandom() {
        return (int) (Math.random() * 5 + 1); // 1 to 5 seconds
    }
}
