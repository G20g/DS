package Assingn1;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner((System.in));
        String str=s.nextLine();
        if(str.length()%2!=0)
        {
            System.out.println("Unbalanced String");
            System.exit(1);
        }
        char arr[]=str.toCharArray();
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            if(arr[i]=='['||arr[i]=='{'||arr[i]=='(')
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]=='}'||arr[j]==']'||arr[j]==')')
                    {
                        c++;
                    }
                }
            }
            if(c%2!=0)
            {
                flag=true;
            }
        }
        if(flag)
        {
            System.out.println("balanced");
        }
        else
            System.out.println("Unbalanced");

    }

}
