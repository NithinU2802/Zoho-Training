/******************************************************************************

Input:
5

Output:
1   5
 2 4
  3
 2 4
1   5

*******************************************************************************/
import java.util.*;

public class XShapedPattern
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int s=1,r=n;
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        if(i==j){
	            if(s==r)
	                r--;
	            System.out.print((s++));
	        }else if(i==n-j-1)
	            System.out.print(r--);
	        else    
	            System.out.print(" ");
	    }
	    System.out.println();
	}
	}
}
