package Question_84;

public abstract class Bird implements Flyable {

    private String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}
