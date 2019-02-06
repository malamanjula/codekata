import java.util.Scanner;
class beg6
{
    public static void main(String[] args)
    {
        int year;
        boolean leap = false;
        System.out.print("Input:\n");
        Scanner in = new Scanner(System.in);
        year=in.nextInt();
        System.out.print("\n"+year+"\n");
        System.out.println("Output:\n");
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("leap year");
        else
            System.out.println("Not");
    }
}
