/******************************************************************************

 You are given with n x n 2D matrix. Your task is to rotate the image by
90 Degree clockwise. The rotation should be done in place meaning you have to modify 
the input 2D directly do not allocate another 2D Matrix.

Input:
1 2 3
4 5 6
7 8 9 

Output:
7 4 1 
8 5 2 
9 6 3

Input:
5 1 9 11
2 4 8 10
13 3 6 7
15 14 12 16

Output:
15 13 2 5 
14 3 4 1 
12 6 8 9 
16 7 10 11

*******************************************************************************/
import java.util.*;

public class 90_DegreeMatrix
{

  public static void main (String[]args)
  {
	Scanner x = new Scanner (System.in);
	int n=x.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++)
	    for(int j=0;j<n;j++)
	        a[i][j]=x.nextInt();
	for(int i=0;i<n;i++)
	    for(int j=i+1;j<n;j++){
	        int t=a[i][j];
	        a[i][j]=a[j][i];
	        a[j][i]=t;
	    }
	for(int i=0;i<n;i++){
	    int j=0,k=n-1;
	    while(j<k){
	        int t=a[i][j];
	        a[i][j]=a[i][k];
	        a[i][k]=t;
	        j++;
	        k--;
	    }
	}
	System.out.println();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++)
	        System.out.print(a[i][j]+" ");
	    System.out.println();
	}
  }
}
