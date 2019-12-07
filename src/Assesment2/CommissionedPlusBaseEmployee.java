package Assesment2;

public class CommissionedPlusBaseEmployee extends Employee {
    double basesalary;
    int sales;
    double salary;

    public CommissionedPlusBaseEmployee(int id, String name, String designation, double basesalary, int sales, double salary) {
        super(id, name, designation);
        this.basesalary = basesalary;
        this.sales = sales;
        this.salary = salary;
    }
    void PrintSalary()
    {
        salary=basesalary+(salary*sales);
        System.out.println(salary);
    }
}
