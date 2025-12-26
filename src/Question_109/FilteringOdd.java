package Question_109;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringOdd {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,88,45,3,4,5,6,5,7,89,35,67);
        System.out.println("Printing using ForEach");
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.print(num + " "));

        // Other method to print
        System.out.println("\nPrinting using Collectors");
        String result = numbers.stream()
                .filter(num -> num % 2 == 1)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
