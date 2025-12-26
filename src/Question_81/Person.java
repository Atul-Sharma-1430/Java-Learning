package Question_81;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (optional)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override equals() to compare based on name and age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Override hashCode() consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    // Main to test
    public static void main(String[] args) {
        Person p1 = new Person("Aditya", 20);
        Person p2 = new Person("Aditya", 20);
        Person p3 = new Person("Rahul", 25);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.hashCode() == p2.hashCode()); // true
    }
}

