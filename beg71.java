import java.util.*;
class factorial
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if(n<=100000){
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}
for(int j=0;j<n-1;j++)
{
System.out.printf("%d ",Math.max(arr[j],arr[j+1]));
}
}
}
}
