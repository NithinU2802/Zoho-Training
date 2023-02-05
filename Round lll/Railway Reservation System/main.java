import java.util.*;
import data.*;

class Main{

public static void main(String arg[]){
Scanner x=new Scanner(System.in);
System.out.println("\nWELCOME TO RAILWAY RESERVATION SYSTEM :)");
TicketBook b=new TicketBook();
int ch=0;
do{
System.out.println("\nONLINE RESERVATION SYSTEM FOR RAILWAY\n1.Book\n2.Cancel\n3.Print booked tickets\n4.Print available tickets\n");
System.out.println("Enter Your Choice: ");
ch=x.nextInt();
switch(ch){

case 1:
Passenger p=new Passenger();
p.getdetails();
b.add(p);
break;

case 2:
System.out.print("Enter ID: ");
int id=x.nextInt();
b.remove(id);
break;

case 3:
b.print();
break;

case 4:
b.available();
break;

default:
System.out.println("Invalid Option");
break;

}
}while(ch<=4 && ch>=0);

}
}
