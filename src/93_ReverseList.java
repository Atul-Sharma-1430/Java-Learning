import java.util.*;

class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,25,57,89,22,30);
        Collections.reverse(list);
        System.out.println(list);
    }
}
