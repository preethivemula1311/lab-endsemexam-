
import java.util.*;
import java.util.stream.*;

class EmployeeRecord {
    String name;
    double salary;

    EmployeeRecord(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Employee {
    public static void main(String[] args) {

        List<EmployeeRecord> employees = Arrays.asList(
            new EmployeeRecord("Priya", 40000),
            new EmployeeRecord("Sangeet", 30000),
            new EmployeeRecord("Viplav", 55000),
            new EmployeeRecord("Shruthi", 60000),
            new EmployeeRecord("Nayan", 75000),
            new EmployeeRecord("Preethi", 39000)
        );

        List<String> result = employees.stream()
            .filter(e -> e.salary > 50000)
            .map(e -> e.name)
            .collect(Collectors.toList());

        System.out.println("Employees earning more than 50000:");

        result.forEach(System.out::println);
    }
}
