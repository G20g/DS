public class TowerofHanoi {
    static void Move(int disk,char src,char dest,char spare){
        if(disk==1){
            System.out.println("Move "+disk+" from "+src+" to "+dest);
        }
        else{
            Move(disk-1,src,spare,dest);
            System.out.println("Move "+disk+" from "+src+" to "+dest);
            Move(disk-1,spare,dest,src);
        }
    }

    public static void main(String[] args) {
        Move(3,'A','B','C');
    }
}
