/******************************************************************************

Input: 5

output:
        *
      *A*A* 
    *A*A*A*A* 
  *A*A*A*A*A*A*
*A*A*A*A*A*A*A*A*

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt(),k=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n+n-k-2;j++) System.out.print(" ");
        for(int j=0;j<k;j++)
        System.out.print("*A");
        k+=2;
        System.out.println("*");
    }
    }
}
