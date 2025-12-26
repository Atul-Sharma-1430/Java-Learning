import java.util.*;

class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,34,67,87,2,3,4,5,4);
        System.out.println(Collections.frequency(list, 4));
        System.out.println(Collections.frequency(list, 2));
        System.out.println(Collections.frequency(list, 5));
        
        //Study more functions in Collection class
    }   
}
