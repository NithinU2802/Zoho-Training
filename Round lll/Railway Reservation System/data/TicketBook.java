package data;
import java.util.*;

public class TicketBook{

Passenger p=new Passenger();

public static Queue<Passenger> total=new LinkedList<Passenger>();
public static Queue<Passenger> upper=new LinkedList<Passenger>();
public static Queue<Passenger> middle=new LinkedList<Passenger>();
public static Queue<Passenger> lower=new LinkedList<Passenger>();
public static Queue<Passenger> rac=new LinkedList<Passenger>();
public static Queue<Passenger> wait=new LinkedList<Passenger>();

public void add(Passenger p){
String berth=p.getberth();
berth=berth.toLowerCase();
int id=p.getId();
String value=" ";
if(berth.equals("upper")){
if(upper.size()<1){
 upper.add(p);
System.out.println("Your ticket has been booked in preferred berth....Upper");
value="upper";
}else{
if(middle.size()<1){ 
middle.add(p);
value="middle";
System.out.println("Sorry..! Your preffered berth is Not Available... Middle berth has been booked...");
}else if(lower.size()<1){ 
lower.add(p);
value="lower";
System.out.println("Sorry..! Your preffered berth is Not Available... Lower berth has been booked...");
}else if(rac.size()<1){ 
rac.add(p);
value="rac";
System.out.println("Sorry..! Your preffered berth is Not Available... RAC allocation has been booked...");
}else if(wait.size()<1){ 
wait.add(p);
value="waiting";
System.out.println("Sorry..! Your preffered berth is Not Available... You are at waiting list which has been booked...");
}else System.out.println("Sorry....!! No Seats are Available....");
}
}else if(berth.equals("middle")){
if(middle.size()<1){ 
value="middle";
middle.add(p);
System.out.println("Your ticket has been booked in preferred berth....Middle");
}else{
if(upper.size()<1){
 upper.add(p);
value="upper";
System.out.println("Sorry..! Your preffered berth is Not Available... Upper berth has been booked...");
}else if(lower.size()<1){
 lower.add(p);
value="lower";
System.out.println("Sorry..! Your preffered berth is Not Available... Lower berth has been booked...");
}else if(rac.size()<1){
 rac.add(p);
value="rac";
System.out.println("Sorry..! Your preffered berth is Not Available... RAC allocation has been booked...");
}else if(wait.size()<1){
 wait.add(p);
value="waiting";
System.out.println("Sorry..! Your preffered berth is Not Available... You are at waiting list which has been booked...");
}else System.out.println("Sorry....!! No Seats are Available....");
}

}else if(berth.equals("lower")){
if(lower.size()<1){
 lower.add(p);
value="lower";
System.out.println("Your ticket has been booked in preferred berth....Lower");
}else{
if(upper.size()<1){
 upper.add(p);
value="upper";
System.out.println("Sorry..! Your preffered berth is Not Available... Upper berth has been booked...");
}else if(middle.size()<1){ 
middle.add(p);
value="middle";
System.out.println("Sorry..! Your preffered berth is Not Available... Middle berth has been booked...");
}else if(rac.size()<1){ 
rac.add(p);
value="rac";
System.out.println("Sorry..! Your preffered berth is Not Available... RAC allocation has been booked...");;
}else if(wait.size()<1){ 
wait.add(p);
value="waiting";
System.out.println("Sorry..! Your preffered berth is Not Available... You are at waiting list which has been booked...");
}else System.out.println("Sorry....!! No Seats are Available....");
}

}else{

if(rac.size()<1){ rac.add(p); value="rac"; }
else if(wait.size()<1){ wait.add(p); value="waiting"; }
else System.out.println("Sorry....!! No Seats are Available....");
}

total.add(p);
if(!value.equals(" "))
p.change(id,value);
System.out.println("YOUR ID IS: "+p.getId());
return;
}

public void remove(int id){

System.out.print("Passenger "+p.remove(id));

}

public void print(){
p.printEvery();
}

public void available(){
System.out.println("Upper: "+upper.size());
System.out.println("Lower: "+lower.size());
System.out.println("RAC: "+rac.size());
System.out.println("Waiting List: "+wait.size());
}


}
