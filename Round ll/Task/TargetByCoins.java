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

  static int res = 0;

  public static void check (int a, int b, int c, int t)
  {
	if (t == 0)
	  res++;
	if (t - 1 >= 0 && a>0)
	  check (a-1, b, c, t - a);
	if (t - 2 >= 0 && b>0)
	  check (a, b-1, c, t - b);
	if (t - 5 >= 0 && c>0)
	  check (a, b, c-1, t - c);
	
  }

  public static void main (String[]args)
  {
	Scanner x = new Scanner (System.in);
	int a = x.nextInt (), b = x.nextInt (), c = x.nextInt (),t=x.nextInt();
	check(a,b,c,t);
	System.out.println(res);
  }
}
