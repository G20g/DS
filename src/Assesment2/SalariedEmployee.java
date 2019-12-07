package Assesment2;

class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(int id, String name, String designation, double fixedSalary) {
        super(id, name, designation);
        this.salary = fixedSalary;
    }

    void PrintSalary()
    {
        System.out.println(salary);
    }

}
