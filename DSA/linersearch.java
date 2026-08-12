package DSA;
import java.util.*;
public class linersearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to find in array-");
        int key=sc.nextInt();
        int index=-1;
             for(int i=0;i<n;i++){
                if(arr[i]==key){
                    index=i;
                    break;
                }
             }
             if(index!=-1){
                System.out.println("Found at index:- "+index);
             } else{
                System.out.println("Not Found");
             }
        }
    }
    

