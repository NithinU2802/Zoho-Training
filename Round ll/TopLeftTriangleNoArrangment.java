/******************************************************************************

Input: 6

output:

1 7 12 16 19 21
2 8 13 17 20 
3 9 14 18 
4 10 15 
5 11
6


*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    for(int i=1;i<=n;i++){
        int k=n,t=i;
        while(k>=i){
        System.out.print(t+" ");
        t+=k;
        k--;
        }
        System.out.println();
    }
    }
}
