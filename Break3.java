public class Break3{
 public static void main(String[] args)
throws java.io.IOException
{
for(int i=0;i<3;i++)
System.out.println("Outer loop count:"+i);
System.out.println("Inner loop count:");
int t=0;
while(t<100){
if(t==0) break;
System.out.println(t+"");
t++;
}
System.out.println();
}
System.out.println("Loops complete.");
}
}
