package DSA;
import java.util.*;
public class stmarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Students:- ");
        int n=sc.nextInt();
        int a[]=new int[n];   // time complexiety Big n
        System.out.println("Enter marks of Students:- ");   
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       // Arrays.sort(a);

        /*int max=a[0];
        for(int i=0;i<n;i++){
        if(a[i]>max){
        max=a[i];
        }
        }
        int min=a[0];
        for(int i=0;i<n;i++){
        if(a[i]<min){
        min=a[i];
        }
        }
        
         */
      int hm=a[n-1];
        int lm=a[0];
        int sum=0;
        for(int j=0;j<n;j++){
            sum=sum+a[j];
        }
        int avg = sum/n;
        System.out.println("Highest marks:- "+hm);
        System.out.println("Lowest marks:- "+lm);
        System.out.println("Average marks:- "+avg);
        int f=21;
        for(int i=0;i<a;i++){
            if(a[i]==f){
                System.out.println("FOUND");

            } 
        }
    }
}
