package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeFilter {

    public static void main(String[] args) {
        List<Employee> employeesList1 = Arrays.asList(
            new Employee("Alice", 30, "HR"),
            new Employee("Bob", 25, "IT"),
            new Employee("Anna", 28, "Finance")
        );
        List<Employee> employeesList2 = Arrays.asList(
            new Employee("John", 35, "IT"),
            new Employee("Andrew", 40, "HR"),
            new Employee("Steve", 22, "Marketing")
        );

//        List<Employee> mergedAndSortedEmployees = Stream.concat(employeesList1.stream(), employeesList2.stream())
//            .sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
//            .collect(Collectors.toList());

        List<Employee> empList = Stream.concat(employeesList1.stream(),employeesList2.stream())
        .sorted((empList1,empList2) -> Integer.compare(empList1.getAge(),empList2.getAge()))
        .collect(Collectors.toList());
        
        empList.forEach(System.out::println);
//        mergedAndSortedEmployees.forEach(System.out::println);
    }
}
