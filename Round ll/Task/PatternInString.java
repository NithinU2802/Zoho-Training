/******************************************************************************

 Given a pattern and a string s. Find if S follows the same pattern.
    Here follow means a full match, such that there is a bisection between a 
letter in pattern and non-empty word in s.

*******************************************************************************/
import java.util.*;

public class PatternInString
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
		String pattern=x.nextLine();
		String[] a=x.nextLine().split(" ");
		String[] match=new String[256];
		if(pattern.length()!=a.length){
		    System.out.println("false");
		    return;
		}
		for(int i=0;i<pattern.length();i++)
		    if(match[pattern.charAt(i)]==null)
		        match[pattern.charAt(i)]=a[i];
		    else if(match[pattern.charAt(i)].equals(a[i]))
		        continue;
		    else{
		        System.out.println("false");
		        return;
		    }
		System.out.println("true");
	}
}
