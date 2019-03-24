public class Help{
 public static void main(String[] args)
 throws java.io.IOException
{
char choice;
System.out.println("Help one:");
System.out.println("Help one:");
System.out.println("Help one:");
System.out.println("Help one:");
choice=(char) System.in.read();
System.out.println("\n");
switch(choice){
case '1':
System.out.println("The if:\n");
System.out.println("if(condition) statement:");
System.out.println("else statement:");
break;
case'2':
System.out.println("The Switch:\n");
System.out.println("switch(expression) {");
System.out.println("case constant");
System.out.println("Statement sequence");
System.out.println("break");
System.out.println("//...");
System.out.println("}");
break;
default:
System.out.println("Selection not found.");
}
}
}