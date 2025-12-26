package Question_110;

public class TestingFunctionalInterface {

    public static void main(String[] args) {

        MyInterface mine = num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int number = 44;
        System.out.println(number + " is prime? " + mine.myFunction(number));
    }
}
