package Assingn1;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.replaceAll(" ","");
        str=str.replaceAll("[\\W]","");
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            int c=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    arr[j]='0';
                }
            }
            if(arr[i]!='0')
            System.out.println("Character "+arr[i]+" occurs "+c+" times");
        }

    }
}
