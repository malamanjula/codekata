import java.util.Scanner;
class beg13
{
public static void main(String args[])
{
int temp;
boolean isPrime=true;
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
for(int i=2;i<=num;i++)
{
   temp=num%i;
    if(temp==0)
    {
    isPrime=false;
    break;
    }
    if(isPrime)
    System.out.println("yes");
    else
    System.out.println("no");
    }
    }
