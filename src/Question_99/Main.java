package Question_99;

public class Main {

    public static void main(String[] args) {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        // here start function runs the code from that thread which we call but if we directly call the run methdo then it will be running from main method only
        t1.start(); 
        t2.start();
    }
}