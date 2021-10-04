package Task10;

import java.util.Comparator;

public class EmployeeFullComparator implements Comparator<Employee>  {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Comparator.comparing(Employee::getSalary).thenComparing(Employee::getSurname).
                thenComparing(Employee::getName).compare(employee1, employee2);
    }
}
