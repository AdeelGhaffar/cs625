public class Queue{
public static void main(String args[]){
private char q[];
private int putloc,getloc;
Queue(int size){
q=new char[size];
putloc=getloc=0;
void put(char ch){
if(putloc==q.length){
System.out.println("-Queue is full:");
return;
}
q[putloc++]=ch;
}
char get(){
if(getloc==putloc){
System.out.println("-Queue is emphty");
return(char)0;
}
return q[getloc++];
}
}
