package TopInterviewQuestions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    int id;
    String name;
    String dept;
    double salary;
    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
