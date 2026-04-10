package TopInterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidSalaryInDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Preeti","IT",700000),
                new Employee(2,"KP","MBA",1500000),
                new Employee(2,"Vasu","IT",1500000),
                new Employee(2,"PK","MBA",1800000),
                new Employee(2,"Archana","HR",1500000)
        );

        Map<String, Optional<Employee>> collect =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
        System.out.println(collect);
    }
}
