package data;
import java.util.*;

public class Passenger{

public static int id=100;
//store data
public static List<Integer> identify=new ArrayList<Integer>();
public static Map<Integer,String> name=new HashMap<Integer,String>();
public static Map<Integer,Integer> age=new HashMap<Integer,Integer>();
public static Map<Integer,String> gender=new HashMap<Integer,String>();
public static Map<Integer,String> berth=new HashMap<Integer,String>();

//current data
public static int a;
public static String n,g,b;

public void getdetails(){
Scanner x=new Scanner(System.in);
System.out.print("Enter Your Name: ");
n=x.nextLine().trim();
name.put(id,n);
System.out.print("Enter Your Age: ");
a=x.nextInt();
age.put(id,a);
System.out.print("Enter Gender: ");
g=x.next();
gender.put(id,g);
x.nextLine();
System.out.print("Enter Preferred Berth: ");
b=x.next();
berth.put(id,b);
identify.add(id);
id++;
}


//current data to reserve/.....
public String getname(){
return n;
}

public int getage(){
return a;
}

public String getgender(){
return g;
}

public String getberth(){
return b;
}

public int getId(){
return id-1;
}

public String remove(int d){
if(age.remove(d)==null)
return "is not available...\n";
gender.remove(d);
string b=berth.remove(d);


for(int i=0;i<identify.size();i++)
if(identify.get(i)==d){ remove(i); break; }
return name.remove(d)+" ticket has been cancelled\n";
}

public boolean check(int d){
if(name.get(d)==null) return false;
return true;
}

public void change(int d,String s){
berth.put(d,s);
}

public void printEvery(){
for(int i: identify){
System.out.println("Name: "+name.get(i));
System.out.println("Age: "+age.get(i));
System.out.println("Gender: "+gender.get(i));
System.out.println("Berth: "+berth.get(i));
System.out.println();
}
}


}
