public class Guess3{
 public static void main(String[] args)
throws java.io.IOException
{
 char ch,answer='k';
System.out.println("I'm thinking of a letter between A and Z.");
System.out.print("can you guess it:");
ch=(char)System.in.read();
if(ch==answer)System.out.println("**Right**");
else{
System.out.print("...Sorry you're");
//a nested if
if(ch<answer) System.out.println("Too low");
else System.out.println("too high");
}
}
}
