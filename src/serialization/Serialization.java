package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("gaurav");
        emp.setRollno(1710991262);
        emp.setAddress("PBX1");
        emp.setSsn(123);
        emp.setPassword(456789);

        Employee emp1 = new Employee();
        emp1.setName("gabes");
        emp1.setRollno(1710991264);
        emp1.setAddress("rajpura");
        emp1.setSsn(145);
        emp1.setPassword(789456);

        try
        {
            FileOutputStream fos = new FileOutputStream("D:\\abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.writeObject(emp1);
            oos.close();
            fos.close();
            System.out.println("Serilized data is saved");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
