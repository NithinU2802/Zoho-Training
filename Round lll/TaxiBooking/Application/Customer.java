package Application;
import java.util.*;


public class Customer{

    int id=-1,time=6,fromTime=6,toTime=6,cost=0;
    char from='A',to='A';
    
    public Customer(int id,int time,char from,char to){
        this.id=id;
	this.time=time;
	this.from=from;
	this.to=to;
	int distance=Math.abs(((int)to)-((int)from))*15;
	int t=distance;
	t-=5;
	cost=100;
	cost+=t;
    }

    public void setFromTime(int start){
	fromTime=start;
    }

    public void setToTime(int end){
	toTime=end;
    }

}