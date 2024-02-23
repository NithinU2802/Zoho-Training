/******************************************************************************

    Given a String s reverse only all the vowels in the string.

Input:
hello 

Output:
holle

*******************************************************************************/
import java.util.*;

public class StringReverse
{
    
    static boolean isVowel(char a){
        a=Character.toLowerCase(a);
        if(a=='a' || a=='e' || a=='i' || a=='u' || a=='o')
            return true;
        return false;
    }
    
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
		String s=x.nextLine(),res="";
		int j=s.length()-1;
		for(int i=0;i<s.length();i++)
		    if(isVowel(s.charAt(i))){
		        while(!isVowel(s.charAt(j)))
		            j--;
		        res+=s.charAt(j--);
		    }else
		        res+=s.charAt(i);
		 System.out.println(res);
	}
}
