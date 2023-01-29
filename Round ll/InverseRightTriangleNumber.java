/******************************************************************************

Input: GRAMPRO

output:

      G 
     GR 
    GRA 
   GRAM
  GRAMP 
 GRAMPR 
GRAMPRO


*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    String s=x.nextLine().trim();
    int n=s.length();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++) System.out.print(" ");
        int k=0;
        while(k<=i) System.out.print(s.charAt(k++));
        System.out.println();
    }
    }
}
