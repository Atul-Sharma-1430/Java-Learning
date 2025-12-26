package Question_84;

public class TestingClass {
    public static void main(String... args) {

        Flyable f = new Parrot();
        f.fly();

        Bird b = new Parrot();  // Parrot Object Using Bird, Output will be same, in Both Cases Parrot fly will be called.
        b.fly();
        System.out.println(b.getBreed());
    }
}
