package Kid;
import java.util.*;
public class SolutionA {
    static void binarySearch(int arr[],int first,int last){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < mid ){
                first = mid + 1;
            }else if ( arr[mid] == mid ){
                System.out.println(mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        int last =arr.length;
        binarySearch(arr,1,last);
    }
}
