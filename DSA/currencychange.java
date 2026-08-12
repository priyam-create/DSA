package DSA;
import java.util.Scanner;
public class currencychange {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int r=sc.nextInt();
     int change=0;
     if(r>=500){
       change=r/500;
       r/=500;
     }
     if(r>=200){
       change=r%200;
       r/=200;
     }
     if(r>=100){
       change=r%500;
       r/=10;
     }
     if(r>=50){
       change=r%50;
       r/=10;
     }
     if(r>=20){
       change=r%20;
       r/=10;
     }
     if(r>=10){
       change=r%10;
       r/=10;
     }
     if(r>=5){
       change=r%5;
       
       System.out.println("five"+change);
       r/=10;
       
     }
     if(r>=2){
       change=r%2;
        r/=10;
        System.out.println("two"+change);
        r/=10;

       
     }
     if(r>=1){
       change=r%1;
       r/=10;
     }
     
       
    }
    
}
