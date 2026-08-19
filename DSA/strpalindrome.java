package DSA;
import java.util.*;
public class strpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
           int left=0;
           int right=s.length()-1;
           boolean check=true;

           while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                check=false;
                break;
            }
        left++;
        right--;
            }
            System.out.println(check?"Palindrome":"Not palindrome");
           }

    }
    

