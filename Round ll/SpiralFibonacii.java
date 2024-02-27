/*****************************************************
 
    Design a M x N matrix and fill the matrix using Fibonacii
sequence in spiral order

INPUT:
M=3,N=4
OUTPUT:
0 1 1 2
34 55 89 3
21 13 8 5
 
 ****************************************************/

import java.util.*;

public class SpiralFibonacii
{
    public static void main(String[] arg){
        Scanner x=new Scanner(System.in);
        int m=x.nextInt(),n=x.nextInt();
        int[] a=new int[m*n];
        int[][] res=new int[m][n];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<m*n;i++)
            a[i]=a[i-1]+a[i-2];
        int is=0,js=0,ie=m-1,je=n-1,k=0;
        while(true){
            for(int j=js;j<=je && k<m*n;j++)
                res[is][j]=a[k++];
            is++;
            for(int i=is;i<=ie && k<m*n;i++)
                res[i][je]=a[k++];
            je--;
            for(int j=je;j>=js && k<m*n;j--)
                res[ie][j]=a[k++];
            ie--;
            for(int i=ie;i>=is && k<m*n;i--)
                res[i][js]=a[k++];
            js++;
            if(k>=m*n)
                break;
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
                
        }
    }
}
