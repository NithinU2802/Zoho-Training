import java.util.*;
import operation.*;

public class Main {
public static void main(String[] args)
{

Scanner x=new Scanner(System.in);
Login log=new Login();
Register reg=new Register();

int ch,f=0;
do{

do{
String pass,id;
System.out.println("1.Login\n2.Register\n");
System.out.println("Enter Your Choice: ");
ch=x.nextInt();
x.nextLint();
}while(ch>2 && ch<=0);

if(ch==1){
System.out.print("Enter Your ID: ");
id=x.nextLine().trim();
System.out.print("Enter Your Password: ");
pass=x.nextLine().trim();
if(!log.check(id,pass)) System.out.println("Invalid Credientials Please Try Again");
}else{

do{
System.out.print("Enter Your Name :");
String name=x.nextLine().trim();
System.out.print("Enter Your id : ");
id=x.nextLine();
System.out.print("Create your password: ");
pass=x.nextLine().trim();
System.out.print("Confirm Your Password: ");
con=x.nextLine().trim();
}while(!pass.equals(con));

if(!reg.enter(name,id,pass)) continue again;
else System.out.print("Registered Successfully");
}
if(log.check(id,pass)) f=1;
}while(f==0);

System.out.println("You Are Logged in Successfully");

}
}
