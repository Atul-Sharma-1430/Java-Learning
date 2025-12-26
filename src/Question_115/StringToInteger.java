package Question_115;
/* Create of list of String representing numbers ("1", "2", "3", "4", "5") Convert ech string to an integer
then again calculating Squares calculate the sum of those squares
 */
import java.util.List;

public class StringToInteger {
    public static void main(String[] args) {

        //List of number string
        List<String> numString = List.of("1", "2", "3", "4", "5");

        // Method Reference used here
        numString.stream()
                 .map(Integer::parseInt)                 //Convert String to Integer
                 .map(num -> Math.pow(num , 2))  // Squares it
                 .reduce(Double::sum)                   // Adds the Square
                 .ifPresent(System.out::println);       // Prints it
    }
}
