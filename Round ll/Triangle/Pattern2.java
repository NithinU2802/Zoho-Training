/******************************************************************************

Input: 5

output:
    A 
   BAB
  CBABC
 DCBABCD
EDCBABCDE

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++) System.out.print(" ");
        char c=(char)('A'+i),t=c;
        while(c>'A') System.out.print(c--);
        while(t>=c) System.out.print(c++);
        System.out.println();
    }
    }
}
