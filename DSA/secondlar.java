package DSA;
import java.util.*;
public class secondlar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
         for(int x:arr){
            if(x>lar){
                sec=lar;
                lar=x;
            } else if(x>sec && x!=lar){
                sec=x;
            }
         }
          System.out.println(sec);


    }

    
}
