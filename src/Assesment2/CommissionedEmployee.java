package Assesment2;

public class CommissionedEmployee extends Employee {
    int no_of_sales;
    double salary;

    public CommissionedEmployee(int id, String name, String designation, int no_of_sales, double salary) {
        super(id, name, designation);
        this.no_of_sales = no_of_sales;
        this.salary = salary;
    }

    void PrintSalary()
    {
        salary=salary*no_of_sales;
        System.out.println(salary);
    }
}
