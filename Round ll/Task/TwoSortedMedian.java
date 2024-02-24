/******************************************************************************

 Median of Two Sorted Array 
 
Input:
nums1=[1,3]
nums2=[2]

Output:
2.00000

Input:
nums1=[1,2]
nums2=[3,4]

Output:
2.50000

*******************************************************************************/
import java.util.*;

public class TwoSortedMedian
{
    
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int m=x.nextInt();
		int[] nums1=new int[m];
		for(int i=0;i<m;i++)
		    nums1[i]=x.nextInt();
		int n=x.nextInt();
		int[] nums2=new int[n];
		for(int i=0;i<n;i++)
		    nums2[i]=x.nextInt();
	    int i=0,j=0,h=(n+m)/2,k=0,prev=0;
	    while(k<h){
	        if(i<m && (j<n && nums1[i]<nums2[j] || j>=n))
	            prev=nums1[i++];
	        else if(j<n)
	            prev=nums2[j++];
	        k++;
	    }
	    int res=0;
	    if(i<m && nums1[i]<nums2[j])
	       res=nums1[i++];
	    else if(j<n)
	        res=nums2[j++];
	    if((m+n)%2==0)
	        System.out.println((prev*1.0+res*1.0)/2.0);
	    else    
	        System.out.println(res);
	}
}
