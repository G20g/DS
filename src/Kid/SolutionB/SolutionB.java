package Kid;
import java.util.*;
public class SolutionB {
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }
    static int findPos(int arr[],int key)
    {
        int l = 0, h = 1;
        int val = arr[1];
        while (val < key)
        {
            l = h;
            if(2*h < arr.length-1)
                h = 2*h;
            else
                h = arr.length-1;
            val = arr[h];
        }
        return binarySearch(arr, l, h, key);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        int ans = findPos(arr,x);
        if(ans==-1){
            System.out.println("Element not in the array");
        }
        else{
            System.out.println(ans);
        }
    }
}
