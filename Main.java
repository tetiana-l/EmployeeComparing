package Task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Milan", "Kor", 6900.54));
        employeeList.add(new Employee("Milan", "Kob", 6900.53));
        employeeList.add(new Employee("Oleg", "Nos", 3500.67));
        employeeList.add(new Employee("Olen", "Nos", 3500.67));

        System.out.println("BEFORE: \n" + employeeList);

        Collections.sort(employeeList);
        System.out.println("With id: \n" + employeeList);

        EmployeeBySalaryComparator employeeBySalaryComparator = new EmployeeBySalaryComparator();
        employeeList.sort(employeeBySalaryComparator);
        System.out.println("With salary: \n" + employeeList);

        EmployeeFullComparator employeeFullComparator = new EmployeeFullComparator();
        employeeList.sort(employeeFullComparator);
        System.out.println("With full comparing: \n" + employeeList);
    }
}

