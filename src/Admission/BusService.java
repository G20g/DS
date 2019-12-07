package Admission;

public class BusService extends DayScholar {
    int rtno;
    String stop;
    public BusService(String name, int age, int mobno,int rtno,String stop,String type) {
        super(name, age, mobno,type);
        this.rtno=rtno;
        this.stop=stop;

    }


}
