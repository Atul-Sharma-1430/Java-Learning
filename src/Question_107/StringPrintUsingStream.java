package Question_107;

import java.util.List;
import java.util.stream.Collectors;


public class StringPrintUsingStream {
    public static void main(String[] args) {

        List<String> names = List.of("Atul ", "Sharma ", "is ", "a ", "Good ", "Boy");

        // Reduce all into one string with spaces
        String result = names.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println(result);


        //Using ForEach
        names.forEach(System.out::print);
        System.out.println();


        //Using Collector
        String result2 = names.stream()
                .collect(Collectors.joining(""));
        System.out.println(result2);

        //Using Join
        String result3 = String.join("", names);

        System.out.println(result3);

    }
}
