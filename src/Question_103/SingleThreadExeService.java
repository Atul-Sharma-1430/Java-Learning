package Question_103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExeService {

    public static void main(String[] args) {

        // if we use try-with-resource then if somehow PC turns off then the program will be automatically closed ie autmatically calls service.shutdown() using finally block;
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new PrintNumbers());
        service.shutdown();        
    }
}