import java.util.Scanner;
public class Exercise3_26
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter an integer:");
		  int n = input.nextInt();
		  boolean divby5 = false;
		  boolean divby6 = false;
		 
		  if (n % 5 == 0) 
		  {
		   divby5 = true;
		  }
		 
		  if (n % 6 == 0) 
		  {
		   divby6 = true;
		  }
		 
		  System.out.println("Is 10 divisible by 5 and 6? " + (divby5 && divby6));
		  System.out.println("Is 10 divisible by 5 or 6? " + (divby5 || divby6));
		  System.out.println("Is 10 divisible by 5 or 6, but not both? "+ (divby5 ^ divby6));
	}

}
