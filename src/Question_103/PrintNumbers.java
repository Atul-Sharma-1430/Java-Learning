package Question_103;

public class PrintNumbers implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number is " + (i+1));
        }
    }
    public static void main(String[] args) {
        
    }
}
