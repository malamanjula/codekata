import java.util.Scanner;
class beg1
{
    public static void main(String[] args)
    {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.println("Input");
        number=s.nextInt();
        System.out.println(number);
        if(number>0)
        {
            System.out.println("Output:");
            System.out.println("Positive");
        }
        else if(number<0)
        {
            System.out.println("Output:");
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Output:");
            System.out.println("Zero");
        }
    }
}
