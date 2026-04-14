package TopInterviewQuestions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Users {
    String name;
    int age;

    public Users(String name , int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
