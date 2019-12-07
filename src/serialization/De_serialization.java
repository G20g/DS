package serialization;

import java.io.*;

public class De_serialization {
    public static void main(String[] args) {
        Employee e1 = null;
        Employee e2 = null;

        try
        {
            FileInputStream fos = new FileInputStream("D:\\abc.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);
            e1 = (Employee) oos.readObject();
            e2 = (Employee) oos.readObject();
            oos.close();
            fos.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("De-Serilized employee data");
        System.out.println("Name = "+ e1.getName());
        System.out.println("Rollno = " + e1.getRollno());
        System.out.println("Address = " + e1.getAddress());
        System.out.println("Ssn = " + e1.getSsn());
        System.out.println("Password = " + e1.getPassword());

        System.out.println();
        System.out.println("Name = "+ e2.getName());
        System.out.println("Rollno = " + e2.getRollno());
        System.out.println("Address = " + e2.getAddress());
        System.out.println("Ssn = " + e2.getSsn());
        System.out.println("Password = " + e2.getPassword());
    }
}
