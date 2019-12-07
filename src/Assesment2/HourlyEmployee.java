package Assesment2;

public class HourlyEmployee extends Employee {
    int hrs;
    double salary;

    public HourlyEmployee(int id, String name, String designation, int hrs, double salary) {
        super(id, name, designation);
        this.hrs = hrs;
        this.salary = salary;
    }
    void PrintSalary()
    {
        salary=salary*hrs;
        System.out.println(salary);
    }
}
