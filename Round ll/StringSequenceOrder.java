/******************************************************************************

    Check the string which is present in A are available in same order on B.
    
Input:
AXY 
YADXCP

Output:
False

Input:
ADFGH
JAKDFGUH

Output:
True 


*******************************************************************************/
import java.util.*;

public class StringSequenceOrder
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    String a=x.nextLine(),b=x.nextLine();
	    int i=0,j=0;
	    while(j<b.length()){
	        if(a.charAt(i)==b.charAt(j)){
	            i++;
	            if(i==a.length()){
	                System.out.println("True");
	                return;
	            }
	        }
	        j++;
	    }
	    System.out.println("False");
	}
}
