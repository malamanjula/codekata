import java.util.Scanner;
class beg2
{
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Input:\n");
        n=s.nextInt();
        System.out.println(n);
        System.out.println("Output:");
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else if(n<=0)
        {
           System.out.println("invalid");
        }
        else
        {
           System.out.println("Odd");
        }
    }
}
