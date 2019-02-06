import java.util.Scanner;
class beg3
{
   public static void main(String[] arg)
   {
	boolean isVowel=false;;
	Scanner scanner=new Scanner(System.in);
	System.out.print("Input:");
	char ch=scanner.next().charAt(0); 
	System.out.print("\n"+ch+"\n");
System.out.println("Output:");
	scanner.close();
	switch(ch)
	{
	   case 'a' :
	   case 'e' :
           case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel = true;
	}
	if(isVowel == true) 
	{
	   System.out.println("Vowel");
	}
	else 
	{
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Consonant");
	     else
		   System.out.println("invalid");		
        }
   }
}
