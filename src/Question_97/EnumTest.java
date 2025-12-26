package Question_97;

public class EnumTest {
    public static void main(String[] args) {

       for(Day day : Day.values()) {
        System.out.println("Day: " + day + ", isWeekDay: " + day.isWeekDay() + ", DayNum: " + day.dayNum());
        
       }
    }
}
