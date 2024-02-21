/******************************************************************************

    MISS & REPEAT 
    
Input:
5
4 1 1 2 3 

Output:
Miss: 5
Repeat: 1

*******************************************************************************/
import java.util.*;

public class MissAndRepeat
{
  public static void main (String[]args)
  {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),repeat=-1;
	int[] a=new int[n+1];
	for(int i=0;i<n;i++)
	    a[i]=x.nextInt();
	int[] counter=new int[n+1];
	for(int i=0;i<n;i++){
	    if(counter[a[i]]==1)
	        repeat=a[i];
	    counter[a[i]]++;
	}
	for(int i=1;i<=n;i++)
	    if(counter[i]==0){
	        System.out.println("Miss: "+i);
	        System.out.println("repeat: "+repeat);
	        return;
	    }
	if(repeat==-1)
	    System.out.println("No Miss and Repeat");
	else 
	    System.out.println("No Miss\n"+"Repeat: "+repeat);
  }
}
