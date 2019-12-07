package Admission;

public class Hosteler extends Student {
    int tier;
    String roomtype;

    public Hosteler(String name, int age, int mobno, int tier, String roomtype,String type) {
        super(name, age, mobno,type);
        this.tier = tier;
        this.roomtype = roomtype;
    }

}
