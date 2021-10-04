package Task10;

import java.util.*;

public class Employee implements Comparable<Employee> {

    private static int count = 1;

    private final Integer id;
    private final String name;
    private final String surname;
    private final Double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        id = createId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary= " + salary +
                "}\n";
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return id.compareTo(otherEmployee.id);
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private int createId() {
        Random random = new Random();
        int n = random.nextInt(100);
        return n * count++;
    }
}
