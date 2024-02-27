/*****************************************************
 
Find the given 2 Strings are Anagram of each other

1)INPUT:
tests
esstt
OUTPUT:
true

2)INPUT:
skyblue
kysllueb
OUTPUT:
false
 
 ****************************************************/

import java.util.*;

public class Anagram
{
    
    public static boolean check(String s,String a){
        int[] r=new int[130];
        if(s.length()!=a.length())
            return false;
        for(int i=0;i<s.length();i++)
            r[s.charAt(i)]++;
        for(int i=0;i<a.length();i++){
            if(r[a.charAt(i)]==0)
                return false;
            r[a.charAt(i)]--;
        }
        return true;
    }
    
    public static void main(String[] arg){
        Scanner x=new Scanner(System.in);
        String s1=x.nextLine(),s2=x.nextLine();
        System.out.println(check(s1,s2));
    }
}
