public class Bubble{
public static void main(String args[])
{
int nums[]={70,88,20,55,44,67,49,5,15,25};
int a,b,t;
int size;
size=10;
System.out.print("Original array is:");
for(int i=0;i<size;i++)
System.out.print(""+nums[i]);
System.out.println();
for(a=1;a<size;a++)
for(b=size-1;b>=a;b--)
{
if(nums[b-1]>nums[b])
{
t=nums[b-1];
nums[b-1]=nums[b];
nums[b]=t;
}
}
System.out.print("Sorted array is:");
for(int i=0;i<size;i++)
System.out.print(""+nums[i]);
System.out.println();
}
} 