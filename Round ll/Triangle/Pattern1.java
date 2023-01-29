/******************************************************************************

Input: 5

output:
    A 
   ABA 
  ABCBA
 ABCDCBA
ABCDEDCBA

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    for(int i=0;i<n;i++){
        char a='A';
        int j=0;
        for(j=0;j<n-i-1;j++) System.out.print(" ");
        while(j<n-1){ System.out.print(a++); j++; }
        while(a>='A') System.out.print(a--);
        System.out.println();
    }
    }
}
