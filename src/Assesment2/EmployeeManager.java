package Assesment2;
import java.util.*;
public class EmployeeManager {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("press option to choose type of Employee");
        System.out.println("1.Salaried Employee");
        System.out.println("2.Hourly Employee");
        System.out.println("3.CommissionedEmployee");
        System.out.println("4.CommisionedPlusBaseEmployee");
        int n=s.nextInt();
        SalariedEmployee se=new SalariedEmployee(101,"abc","abcd",1000);
        HourlyEmployee he=new HourlyEmployee(102,"girish","abcdf",3,2000);
        CommissionedEmployee ce=new CommissionedEmployee(103,"csink","cdj",500,500);
        CommissionedPlusBaseEmployee cbe=new CommissionedPlusBaseEmployee(104,"degsu","dhueusih",1000,200,6000);
        switch(n)
        {
            case 1 :
                System.out.println("SalariedEmployee Employee details");
                System.out.println(se.getId()+" "+se.getName()+" "+se.getDesignation());
                se.PrintSalary();
                break;
            case 2 :
                System.out.println("HourlyEmpoyeed Employee Details");
                System.out.println(he.getId()+" "+he.getName()+" "+he.getDesignation());
                he.PrintSalary();
                break;
            case 3 :
                System.out.println("CommisionedEmployee Details");
                System.out.println(ce.getId()+" "+ce.getName()+" "+ce.getDesignation());
                ce.PrintSalary();
                break;
            case 4 :
                System.out.println("CommisionedPlus Base Employee Details");
                System.out.println(cbe.getId()+" "+cbe.getName()+" "+cbe.getDesignation());
                cbe.PrintSalary();
                break;
            default :
                System.out.println("Wrong Input");

        }
    }
}
