package TopInterviewQuestions;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class thirdHighestSalary {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1,"Preeti","IT",700000),
                new Employee(2,"KP","MBA",1500000),
                new Employee(2,"Vasu","IT",1500000),
                new Employee(2,"PK","MBA",1800000),
                new Employee(2,"Archana","HR",1500000)
        );

        System.out.println(employee.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee Not Found")));
    }
}
