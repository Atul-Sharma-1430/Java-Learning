package Question_113;
/*
Given an array of Integer, Create a Stream, use Distinct operation to remove duplicates,
and collect the result into a new list.
*/

import java.util.List;
import java.util.Scanner;

public class TestingDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = List.of(2,2,3,4,7,9,0,1,2,3);
        List<Integer> withoutDuplicates = numbers.stream().distinct().sorted().toList();

        System.out.println("List After removing the Duplicates is: " + withoutDuplicates);
        sc.close();

    }
}
