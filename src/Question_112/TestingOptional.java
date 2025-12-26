package Question_112;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {

        List<String > names = List.of("Atul" ,"Sharma");

        // cannot use for each because it has a void return type
        Optional<String> optionalValue = names.stream().map(String::toUpperCase).reduce((s1 , s2) -> s1 + " " + s2);
        optionalValue.ifPresent(System.out::println);
    }
}

