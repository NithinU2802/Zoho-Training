/******************************************************************************

Input: 12345

output:
1   5
 2 4
  3  
 2 4
1    5


*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    String a=x.nextLine().trim();
    int n=a.length(),k=0,s=0,e=n-1,f=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           if(j==s || j==e) System.out.print(a.charAt(j));
           else System.out.print(" ");
        }
        s++;
        e--;
        System.out.println();
    }
    }
}
