package Question_102;

public enum TrafficColors {
    RED(6000),
    YELLOW(1000),
    GREEN(3000);
    
    private int timeInMillis;

    public int getTime() {
        return timeInMillis;
    }

    TrafficColors(int timeInMillis) {
        this.timeInMillis = timeInMillis;
    }
}
