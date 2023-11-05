import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] arg) throws IOException{
    File file = new File("BankDB.txt");
    Scanner x=new Scanner(new FileReader(file));
    ArrayList<String> id=new ArrayList<String>();
    ArrayList<String> names=new ArrayList<String>();
    ArrayList<String> cities=new ArrayList<String>();
    ArrayList<Customer> customers=new ArrayList<Customer>();
   
    int k=0;
    while(x.hasNextLine()){
	String[] d=x.nextLine().split("\\s");
	Customer customer=new Customer(Integer.parseInt(d[0]),d[1],d[2]);
	id.add(d[0]);
	names.add(d[1]);
	cities.add(d[2]);
	customers.add(customer);
    }

    for(Customer customer:customers)
	System.out.println(customer.id+" "+customer.name+" "+customer.city);

    }
}