package Question_114;
/*
Create a list of the Employees with the name and salary field. Write a Comparator that sorts the employee
by salary. Then use this comparator to sort your list using sort Stream Operation
*/

public class Employee {

    private final String name;
    private final int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
