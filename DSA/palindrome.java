package DSA;

import java.util.Scanner;

public class palindrome {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int rem;
        int n = num;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==num){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
    
}
