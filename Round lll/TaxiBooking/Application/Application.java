package Application;
import java.util.*;

public class Application{

   Scanner x=new Scanner(System.in);

   Map<Integer,Details> taxi=new HashMap<Integer,Details>();
   List<Customer> customers=new ArrayList<Customer>();
 
   public Application(){
    for(int i=1;i<=4;i++){
	taxi.put(i,new Details(i));
    }
    }

    public void book(){
	int f=0,id=-1;
	char pickUp='1',dropUp='1';
	while(f==0){
	System.out.print("Customer ID: ");
	id=x.nextInt();
	f=1;
	for(int i=0;i<customers.size();i++)
		if(customers.get(i).id==id){
			f=0;
			break;
		}
	if(f==0)
	    System.out.println("Customer is Already Available..! Please Make it again...?");
	}
	f=0;
	while(f==0){
	f=1;
	System.out.print("Pickup Point: ");
	pickUp=x.next().charAt(0);
	System.out.print("Drop Point: ");
	dropUp=x.next().charAt(0);
	if(pickUp>'F' || pickUp<'A' || dropUp>'F' || dropUp<'A')
		f=0;
	if(f==0)
	    System.out.println("Check Whether the stop available for A B C D E F only...? ");
	}
	System.out.print("Pickup Time: ");
	int time=x.nextInt();
	Customer customer=new Customer(id,time,pickUp,dropUp);
	f=0;
	int reachTime=-1,start=-1,end=-1,k=-1;
	Details select=null;
	for(int i=1;i<=4;i++){
	    if(taxi.get(i).available(pickUp,dropUp,time)){
		if(reachTime==-1 || reachTime>taxi.get(i).reachTime){
			k=i;
			start=taxi.get(i).start;
			end=taxi.get(i).end;
		}
		customer.setFromTime((int)(pickUp-'0'));
		customer.setToTime(taxi.get(i).end);
		f=1;
		break;
	    }
	}
	if(f==1){
	    System.out.println("Taxi can be allotted.");
	    System.out.println("Taxi-"+k+" is allotted");
	    taxi.get(k).setRange(start,end);
	    taxi.get(k).add(customer);
	}else if(f==0)
	    System.out.println("Sorry..! Currently No Cab is Available...! ");
	System.out.println();
    }

    public void details(){
	Details details=null;
	for(int i=1;i<=4;i++){
	    details=taxi.get(i);
	    System.out.println("Taxi-"+details.id);
	    System.out.println("Total Earnings: "+details.earning());
	    System.out.println("Customer_id--Source--Destination--Timing--From--To--");
	    List<Customer> customers=details.customers();
	    for(Customer customer:customers){
		System.out.println(customer.id+"--"+customer.from+"--"+customer.to+"--"+customer.time+"--"+customer.fromTime+"--"+customer.toTime);
	    }
	System.out.println();
	}
    }

}