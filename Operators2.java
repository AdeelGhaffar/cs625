public class operator
{
public static void main(String[] args)
{
int a=20,b=10;
String x="Thank",y="Thank";
int ar[]={1,2,3};
int br[]={1,2,3};
boolean condition=true;
System.out.println("a==b:"+(a==b));
System.out.println("a<b:"+(a<b));
System.out.println("a<=b:"+(a<=b));
System.out.println("a>b;"+(a>b));
System.out.println("a>=b:"+(a>=b));
System.out.println("a!=b:"+(a!=b));
//Array ca not compare with
//relational operators because objects
//store references not the value
System.out.println("x==y:"+(ar==br));
System.out.print("condition==true:"+(condition)); 

}
}