package DSA;
import java.util.*;
public class missingnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int total=n*(n+1)/2;
        int missing=total-sum;
        System.out.println(missing);
    }
}
