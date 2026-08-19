package DSA;
import java.util.*;
public class vowelconsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int vow=0;
        int con=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vow++;
            else con++;
        }
        System.out.println("vowel- "+vow);
        System.out.println("consonant- "+con);

    }
    
}
