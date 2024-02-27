/*********************************************************

    Finding Longest sequence of sum from the give array.

*********************************************************/
import java.util.*;

class LongestSequenceSum{
    public static void main(String[] arg){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        int resFrom=0,resTo=0,start=0,sum=0,temp=0,res=0;
        for(int i=0;i<n;i++){
            if(a[i]>a[i]+sum){
                sum=a[i];
                temp=i;
            }else
                sum+=a[i];
            if(sum>res){
                res=sum;
                resFrom=temp;
                resTo=i;
            }
        }
        System.out.println(resFrom+" to "+resTo+" = "+res);
    }
}
