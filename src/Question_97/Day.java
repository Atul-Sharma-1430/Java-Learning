package Question_97;

// Enums = A group of predefined named constants.
public enum Day {
    MONDAY(true , 1),
    TUESDAY(true,2),
    WEDNESDAY(true,3),
    THURSDAY(true,4),
    FRIDAY(true,5),
    SATURDAY(false,6),
    SUNDAY(false,7);

    private final boolean isWeekDay;
    private final int dayNum;

    Day(boolean isWeekDay, int dayNum) {  //Constructor
        this.isWeekDay = isWeekDay;
        this.dayNum = dayNum;
    }

    public String isWeekDay() {
        return isWeekDay ? "Yes" : "No";
    }

    public int dayNum() {
        return dayNum;
    }
}


