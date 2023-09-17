package one_to_many;


import one_to_many.model.Department;
import one_to_many.model.Employee;

import java.util.List;

public class OneToMany {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John");
        Employee employee2 = new Employee(2, "Alice");
        Employee employee3 = new Employee(3, "Bob");
        Employee employee4 = new Employee(4, "Mark");
        Employee employee5 = new Employee(5, "Bob2");
        Employee employee6 = new Employee(6, "Roy");

        List<Employee> employees = List.of(
                employee1, employee2,
                employee3, employee4,
                employee5, employee6
        );

        List<Department> departmentList = List.of(
                new Department(1, "department1", List.of(employee1, employee2)),
                new Department(2, "department2", List.of(employee3, employee6)),
                new Department(3, "department3", List.of(employee4, employee5))
        );


        employees.forEach(employee -> {
            System.out.println(employee);
            departmentList.forEach(department -> {
                if (department.getEmployees().stream().anyMatch(emp -> emp.getId() == employee.getId())) {
                    System.out.println("\t" + department);
                }
            });
        });
    }
}
