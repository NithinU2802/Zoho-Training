import java.util.*;

class Register{

public static ArrayList<String> name=new ArrayList<String>();
public static ArrayList<String> pass=new ArrayList<String>();
public static ArrayList<String> id=new ArrayList<String>();

public boolean enter(String n, String d,String p){
for(String i: id)
if(i.equals(d)){
System.out.println("ID is Already Available"); return false; }
name.add(n);
pass.add(p);
id.add(d);
return true;
}

public String getName(String d){
for(int i=0;i<id.size();i++){
if(id.get(i).equals(d)) return name.get(i);
}
return "Sorry Error To reach you but... ";
}
}
