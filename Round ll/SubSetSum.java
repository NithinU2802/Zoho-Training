/******************************************************************************

Print all the possible subsets of array which adds up to give a sum.
Input: array{2, 3, 5, 8, 10}
       sum=10
Output: {2, 3, 5}
       {2, 8}
       {10}
       
*******************************************************************************/
import java.util.*;

public class SubSetSum
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		    a[i]=x.nextInt();
		int sum=x.nextInt();
		Arrays.sort(a);
		int[] b=new int[n];
		for(int i=0;i<n;i++){
		    int s=a[i],k=0;
		    if(s>sum)
		        break;
		    if(s==sum){
		        System.out.println(a[i]);
		        continue;
		    }
		    b[k++]=a[i];
		    for(int j=i+1;j<n;j++){
		        k=1;
		        s=a[i]+a[j];
		        b[k++]=a[j];
		        if(s>sum)
		            break;
		        if(s!=sum)
    		        for(int l=j+1;l<n;l++){
	    	            s+=a[l];
	    	            b[k++]=a[l];
	    	            if(s>=sum)
	    	                break;
		            }
		        if(s==sum){
		            for(int l=0;l<k;l++)
		                System.out.print(b[l]+" ");
		            System.out.println();
		        }
		    }
		    
		}
	}
}
