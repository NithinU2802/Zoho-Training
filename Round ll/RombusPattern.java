import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=5,f=0;
	for(int i=0;i<n+n;i++){
	    if(f==0){
	    int s=1;
	    for(int j=0;j<n-i-1;j++)
	        System.out.print(" ");
	    for(int j=n-i-1;j<n;j++)
	        System.out.print(s++);
	    for(int j=0;j<i;j++)
	        System.out.print(s++);
	        if(i==n-1)
	            f=1;
	    }else{
	    int k=n+n-i-2,s=1;
	    for(int j=0;j<n-k-1;j++)
	        System.out.print(" ");
	    for(int j=n-k-1;j<n;j++)
	        System.out.print(s++);
	    for(int j=0;j<k;j++)
	        System.out.print(s++);
	    }
	    System.out.println();
	}
// 	for(int i=n-1;i>=0;i--){
// 	    for(int j=0;j<n-i-1;j++)
// 	        System.out.print(" ");
// 	    for(int j=n-i-1;j<n;j++)
// 	        System.out.print("*");
// 	    for(int j=0;j<i;j++)
// 	        System.out.print("*");
// 	    System.out.println();
// 	}
	}
}
