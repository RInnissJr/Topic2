import java.util.Scanner;

public class Exercise3_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random()* 50 + 1);
		System.out.println("The first number is "+number1);
		int number2 = (int) (Math.random()* 50 + 1);
		System.out.println("The second number is "+number2);
		System.out.println("What is the sum of the two numbers?");
		int youranswer = input.nextInt();
		int answer = number1+number2;
		
		if(youranswer==answer)
		{
			System.out.println("You are correct. The answer is: "+answer);
			
		}
		else
		{
			System.out.println("You are wrong. You put in "+youranswer+" but the answer is "+answer);
		}
	}

}
