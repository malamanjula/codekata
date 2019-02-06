import java.util.Scanner;
class beg9
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int k=scan.nextInt();
int i;
int[] array=new int[10];
int sum=0;
for(i=0;i<N;i++)
{
array[i]=scan.nextInt();}
for(i=0;i<k;i++)
{
sum=sum+array[i];
}
System.out.println(sum);
}
}
