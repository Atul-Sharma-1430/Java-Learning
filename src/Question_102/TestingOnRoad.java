package Question_102;

public class TestingOnRoad {

    public static void main(String[] args) throws InterruptedException{
        Traffic red = new Traffic(TrafficColors.RED);
        Traffic yellow = new Traffic(TrafficColors.YELLOW);
        Traffic green = new Traffic(TrafficColors.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
    }
}