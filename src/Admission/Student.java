package Admission;

public class Student {
    String name;
    int age;
    int mobno;
    String type;

    Student(String name,int age,int mobno,String type)
    {
        this.name=name;
        this.age=age;
        this.mobno=mobno;
        this.type=type;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMobno() {
        return mobno;
    }

    public String getType() {
        return type;
    }
}
