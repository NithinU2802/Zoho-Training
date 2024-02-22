/******************************************************************************

    MOVE ALL ZERO'S TO THE END 
    
Input:
8
4 8 0 0 2 0 1 0

Output:
4 8 2 1 0 0 0 0

*******************************************************************************/
import java.util.*;

public class MoveZero
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		    a[i]=x.nextInt();
		int j=0;
		for(int i=0;i<n;i++)
		    if(a[i]!=0)
		        a[j++]=a[i];
		while(j<n)
		    a[j++]=0;
		for(int i=0;i<n;i++)
		    System.out.print(a[i]+" ");
	}
}
