import java.util.Scanner;
class beg10
{
private static Scanner sc;
public static void main(String[] args)
{
int Number,Count=0;
sc=new Scanner(System.in);
Number=sc.nextInt();
while(Number>0)
{
Number=Number/10;
Count=Count+1;
}
System.out.println(Count);
}
}
