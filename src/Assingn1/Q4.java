package Assingn1;
import java.util.*;
class Player{
    String name;
    int score;

    Player()
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player>
{
    public int compare(Player p1,Player p2)
    {
        if(p1.score>p2.score)
            return 1;
        else if(p1.score<p2.score)
            return -1;
        else
            return 0;
    }

}
public class Q4 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter No. of Players");
        int n=s.nextInt();
        Player p[]=new Player[n];
        for(int i=0;i<n;i++)
        {
            p[i].setName(s.nextLine());
            p[i].setScore(s.nextInt());
        }
        List<Player> list=new ArrayList<>();
        List<Player> l2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(p[i]);
        }
        Checker obj=new Checker();
        //list.sort();
        for(int i=0;i<n;i++) {
            System.out.println();
        }
        }
    }

