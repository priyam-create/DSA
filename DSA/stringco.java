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
        char ch='a';
        int a=ch-32;
        System.out.println((char)a);
        
        String s3="abcd";
        String s4="abcd";
        if(s3==s4) System.out.println("same");
        else System.out.println("Not same");

        System.out.println(s3.equals(s4));
        String s5="ABcd";
        String s6="abcd";
        //toLowerCase();
        //toUpperCase();
        System.out.println(s5.equalsIgnoreCase(s6));

        String s7="Hello World";
        String s8="Hello";
        System.out.println(s7.startsWith(s8));
        String s9="World";
        System.out.println(s7.endsWith(s9));
        String s10="ello";
        System.out.println(s7.contains(s10));
        //.indexOf();
        //.lastIndexOf();
        String s11="     Hello    ";
        System.out.println(s11.trim());

        String s12="abcaadefa";
        String s13= s12.replace('a','z');
        //.replaceFirst();
        System.out.println(s13);


        String s14="Abcdef";
        System.out.println(s14.substring(3,6));
        System.out.println();

        



    }
}
