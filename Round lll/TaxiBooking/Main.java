import java.util.*;

import Application.*;

public class Main{

public static void main(String[] arg){
Scanner x=new Scanner(System.in);
int choice=-1;
Application app=new Application();
do{
System.out.println("1.Booking\n2.Earning Details\n3.Exit\n");
choice=x.nextInt();

switch(choice){
   case 1:
	app.book();
	break;
   case 2:
	app.details();
	break;
   case 3:
	break;
   default:
	System.out.println("Invalid : Range of Option 1 to 3...?");
	break;
   }
}while(choice!=3);

}

}

