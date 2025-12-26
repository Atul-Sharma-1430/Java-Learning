package Question_102;

public class Traffic extends Thread {
    private final TrafficColors color;

    public Traffic(TrafficColors color) {
        this.color = color;
    }

    public void run() {
        System.out.printf("%s is active \n", color);
        try {
            Thread.sleep(color.getTime());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s is Inactive \n", color);
    }
    
}
