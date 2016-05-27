package transientkeyword;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    int age;
    transient float money;//Now it will not be serialized

    public Student(int id, String fullName, int age, float money) {
        this.id = id;
        this.name = fullName;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }
}