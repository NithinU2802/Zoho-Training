/******************************************************************************

.You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can
you climb to the top?

*******************************************************************************/
import java.util.*;

public class ClimbingStair
{
    static int res=0;
    
    public static void check(int s,int n){
        if(s==n)
            res++;
        else if(s>n)
            return;
        check(s+1,n);
        check(s+2,n);
    }
    
	public static void main(String[] args) { 
	    Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		res=0;
		check(0,n);
		System.out.println(res);
	}
}
