public class Guess{
public static void main(String args[])
throws java.io.ioexception{
char ch,answer='k';
System.out.println("I'm thinking of a letter:")
System.out.println("can you guess it:");
ch=(char)System.in.read();//read a char from the keyboard
if(ch==answer)System.out.println("**Right**");
}
}