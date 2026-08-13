package DSA;
import java.util.*;
public class stringco {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abcd";
        String s1=new String("abcd");
        System.out.println(s1);
        char c[]={'A','b','c','d','e'};
        String s2=new String(c);
        System.out.println(s2);

        char arr[]=s1.toCharArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(s2.length());
        for(int i=0;i<s2.length();i++){
            System.out.println(s2.charAt(i));
        }

    }
}
