import java.util.Scanner;
public class Exercise3_33 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter weight and price for package 1:");
		  double w1 = input.nextDouble();
		  double p1 = input.nextDouble();
		  System.out.println("Enter weight and price for package 2:");
		  double w2 = input.nextDouble();
		  double p2 = input.nextDouble();
		  double r = w2 / p2 - w1 / p1;
		  String s = "";
		 
		  if (r < 0.0000001) 
		  { 
		   System.out.println("Two packages have the same price.");
		   System.exit(0);
		  }
		 
		  if (r > 0)
		  {
		   s = "Pakage 2";
		  } 
		  else 
		  {
		   s = "Pakage 1";
		  }
		 
		  System.out.println(s + " has better price.");
	}

}
