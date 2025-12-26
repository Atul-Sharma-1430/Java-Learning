/*
Purpose:
Runnable is like a task template.
Whenever you want some work to be done in a thread, you implement run() with your own logic.
How it works:
You define the task inside run().
You pass it to a Thread or ExecutorService.
The thread calls the run() method in parallel to your main program.

Runnable is a functional interface in Java (introduced long ago, Java 1.0+) that represents a task that can be executed by a thread.
Runnable is a functional interface, which means it has only one abstract method:
 */
package Question_105;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Creating Runnable task with our own function definition
        Runnable printNumbers = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
            }
        };

        // Runnable 1 with own function
        Runnable printNumbers1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i+1);
            }
        };

        executor.submit(printNumbers);
        executor.submit(printNumbers1);

        executor.shutdown();

    }
}
