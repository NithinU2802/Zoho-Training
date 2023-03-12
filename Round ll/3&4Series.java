/******************************************************************************

Find the nth number in the number system. First few numbers in the number 
system are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 
3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444, …

Input:
10 
3 4 33 34 43 44 333 334 343 344 

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int c=2,s=0,e=1;
	int[] a=new int[n+1];
	a[0]=3;
	a[1]=4;
	while(c<=n){
	    for(int i=s;i<e && c<=n;i++){
	        a[c++]=(a[i]*10)+3;
	        if(c>n) break;
	        a[c++]=(a[i]*10)+4;
	    }
	    
	    s=e;
	    e++;
	}
	for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
	}
}
