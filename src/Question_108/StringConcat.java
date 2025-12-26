package Question_108;

import java.util.List;
import java.util.stream.Collectors;

public class StringConcat {
    public static void main(String[] args) {

        List<String> names = List.of("Atul" , "Vishwakarma" , "ChangeshKhan" , "Sharma" , "MalaysiaJapan");

        //Printing using ForEach
        names.stream().filter(str -> str.length() > 10).forEach(System.out::println);

        //Printing using Collectors
        String result = names.stream()
                .filter(str -> str.length() > 10)
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}

