public class OverloadDemo{
public static void main(String args[]){
overload ob=new overload();
int resI;
double resD;
ob.ovlDemo();
System.out.println();
ob.ovlDemo(2);
System.out.println();
resI=ob.ovlDemo(4,6);
System.out.println("Result of ob.ovlDemo(4,6):"+resI);
System.out.println();
resD=ob.ovlDemo(1.1,2.32);
System.out.println("Result of ob.ovlDemo(1.1,2.32):"+resD);

}
}
