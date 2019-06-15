public class Queue1{
public static void main(String args[]){
private char q[]'
private int putloc,getloc;
Queue1(int size){
q=new char[size];
putloc=getloc=0;
}
Queue1(Queue1 ob)
{
putloc=ob.putloc;
getloc=ob.getloc;
q=new char[obq.length];
for(int i=getloc;i<putloc;i++);
q[i]=ob.q[i];
}
Queue1(char a[]){
putloc=0;
getloc=0;
q=new char[a.length];
for(int i=0;i<a.length;i++)
put(a[i]);
}
void put(char ch){
if(putloc==q.length){
System.out.println("-Queue is full:");
return;
}
q[putloc++]=ch;
}
char get(){
if(getloc==putloc){
System.out.println("-Queue is emphty:");
return(char)0;
}
return q[getloc++];

}
}
