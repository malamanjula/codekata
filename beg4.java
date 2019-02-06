import java.util.Scanner;
public class beg4
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input:");
        ch=scan.next().charAt(0);
        System.out.print("\n"+ch+"\n");
        System.out.println("Output:");
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("No");
        }
    }
}
