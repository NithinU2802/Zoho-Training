/******************************************************************************

 To generate parenthesis for the given integer every possibilites.

Input:
n=3

Output:
((()))
(()())
(())()
()(())
()()()

*******************************************************************************/
import java.util.*;

public class GenerateParenthesis
{
    
    public static void generateParenthesis(int open,int close,String res){
        if(open==0 && close==0){
            System.out.println(res);
            return;
        }
        if(open>0)
            generateParenthesis(open-1,close,res+"(");
        if(close>open)
            generateParenthesis(open,close-1,res+")");
    }

  public static void main (String[]args)
  {
	Scanner x = new Scanner (System.in);
	int n=x.nextInt();
	generateParenthesis(n,n,"");
  }
}
