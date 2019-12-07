package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private int rollno;
    private String address;
    private static int ssn;
    private transient int password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getSsn() {
        return ssn;
    }

    public static void setSsn(int ssn) {
        Employee.ssn = ssn;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
