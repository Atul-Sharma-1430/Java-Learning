package Question_89;

import java.util.Scanner;

public class varArgsStrConcate {

    public static String concateString(String... strs) {
        StringBuilder result = new StringBuilder();
        for(String str : strs) {
            result.append(str).append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(concateString("Atul"));
        System.out.println(concateString("Atul", "Sharma"));
        System.out.println(concateString("Aditya", "Sharma"));
        System.out.println(concateString("Atul"));
        sc.close();
    }
}
