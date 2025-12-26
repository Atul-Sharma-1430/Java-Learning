import java.util.*;

class CustomComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Boy", "Aditya", "Raj", "Vausaj"); // Kind of array ...a
        System.out.println(list);
        sortDescCustomComp(list);
        System.out.println(list);
    }

    // Normally using collection class inbuild function
    public static void sortDesc(List<String> list) {
        Collections.reverse(list);
    }

    //Using Custom Comparator
    public static void sortDescCustomComp(List<String> list) {
        Collections.sort(list); // This sorts automatically bades on its own like default

        // Comparator sorting based in Conditions given by us
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s, String t1) {
                if(s.equals(t1)) {
                    return 0;
                } else if (s.charAt(0) < t1.charAt(0)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

    }

}
