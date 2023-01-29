class Login{

public boolean check(String d,String n){
Register reg=new Register();
for(int i=0;i<reg.id.size();i++){
System.out.println(d+" "+reg.id.get(i));
if(d.equals(reg.id.get(i))) return true;
}
return false;
}
}
