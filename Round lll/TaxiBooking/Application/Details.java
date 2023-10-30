package Application;
import java.util.*;

class Details{

    int id=-1,totalEarnings=0,timing=6;
    char location='A';
    List<Customer> customers=new ArrayList<Customer>();
    Map<Integer,Integer> range=new HashMap<Integer,Integer>();
    int start=-1,end=-1,reachTime=-1;

    public Details(int id){
	this.id=id;
	location='A';
	totalEarnings=0;
	timing=6;
    }

    public boolean available(char pick,char drop,int time){
	boolean avail=false;
	reachTime=Math.abs(((int)(location-'0'))-((int)(pick-'0')));
	int tripTime=Math.abs(((int)(drop-'0'))-((int)(pick-'0')));
	int distance=tripTime*15;
	int totalTime=reachTime+tripTime;
	start=time-reachTime;
	end=time+tripTime;
	int f=0;
	for(Map.Entry<Integer,Integer> entry:range.entrySet())
	    if( (entry.getKey()<=end && entry.getValue()>=start) || (entry.getKey()<=end && entry.getValue()>=end)){
	    f=1;
	}
	if(f==0){
	    int t=distance;
	    t-=5;
	    totalEarnings+=100;
	    totalEarnings+=10*t;
	    return true;
	}
	return false;
    }

    public void setRange(int start,int end){
	this.start=start;
	this.end=end;
	range.put(start,end);
    }

    public void add(Customer customer){
	customers.add(customer);
    }

    public int earning(){
	return totalEarnings;
    }

    public List<Customer> customers(){
	return customers;
    }

}