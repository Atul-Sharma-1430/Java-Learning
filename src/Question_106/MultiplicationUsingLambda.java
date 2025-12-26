package Question_106;

import java.util.List;
import java.util.function.BinaryOperator;

public class MultiplicationUsingLambda {
    public static void main(String[] args) {

        System.out.println("Printing For two numbers");
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(2, 4));

        System.out.println("\nPrinting Using reduce");
        List<Integer> numbers = List.of(2,3,4,5,6,7);
        int result = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(result);


        //Printing after peeking
        System.out.println("\nPrinting after peeking");
        int result2 = numbers.stream()
                .peek(n -> System.out.println("Processing: " + n))
                .reduce(1, (a, b) -> a * b);

        System.out.println("Final Result = " + result2);

//        Identity → starting value for each chunk (0 in your case).
//        Accumulator → works step by step inside each chunk, adding the lengths of strings.
//        Combiner → only runs after all partial sums in each chunk are ready, to merge them into the final result.

    }
}
