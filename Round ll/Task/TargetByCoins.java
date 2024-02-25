/******************************************************************************

 A: 1 rupee coins, B: 2 Rupee coins, C: 5 Rupee Coins. Find how many ways you 
can pick them up so that the total sum on the coins picked will be equal to 
target.

Input:
3 2 1 5

Output:
3

*******************************************************************************/
import java.util.*;

public class TargetByCoins
{
  public static void main (String[]args)
  {
	Scanner x = new Scanner (System.in);
	int res=0;
	int a = x.nextInt (), b = x.nextInt (), c = x.nextInt (),t=x.nextInt();
	for(int i=0;i<=a;i++)
	    for(int j=0;j<=b;j++)
	        for(int k=0;k<=c;k++)
	            if((i*1)+(j*2)+(k*5)==t)
	                res++;
	System.out.println(res);
  }
}
