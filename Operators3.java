public class Operators
{
public static void main(String[] args)
{
String x="sher";
String y="locked";
Scanner s=new Scanner(System.in);
System.out.print("Enter username:");
String uuid=s.next();
System.out.print("Enter Password:");
String upwd=s.next();
if((uuid.equal(x)&&upwd.equals(y)) ||
(uuid.equals(y)&&upwd.equals(x))){
System.out.println("Welcome user.");
}else{
System.out.println("wrong uid or password");
}
}
}