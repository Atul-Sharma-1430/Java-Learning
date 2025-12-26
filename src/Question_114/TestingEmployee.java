package Question_114;

import java.util.Comparator;
import java.util.List;

public class TestingEmployee {
    public static void main(String[] args) {

        // Creating list of Object of Employee Class
        List<Employee> employees = List.of(
                new Employee("Atul" , 50),
                new Employee("Rahul" , 60),
                new Employee("Chaitanya" , 70),
                new Employee("Vivek" , 80),
                new Employee("Raja" , 90)
        );

        //Method 1 to sort it and print it
        employees.stream()
                 .sorted(
                        (emp1 , emp2)
                        -> Integer.compare(emp1.getSalary(),emp2.getSalary())).forEach(System.out::println);

        //Method 2 using Comparator
        employees.stream()
                 .sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);
    }
}
