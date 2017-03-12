import java.util.Scanner;

public class Exercise3_5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		String dayString= "";
		
		 switch(today%7){
		   case 0:dayString= "Sunday";break;
		   case 1:dayString= "Monday";break;
		   case 2:dayString= "Tuesday";break;
		   case 3:dayString= "Wednesday";break;
		   case 4:dayString= "Thursday";break;
		   case 5:dayString= "Friday";break;
		   case 6:dayString= "Saturday";break;
		   
		  }
		 System.out.print("Today is " + dayString + " and the future day is " );
		 
		 int day = (today + daysElapsed);
		 
		 switch(day%7){
		   case 0:dayString= "Sunday";break; 		 	
		   case 1:dayString= "Monday";break;
		   case 2:dayString= "Tuesday";break;
		   case 3:dayString= "Wednesday";break;
		   case 4:dayString= "Thursday";break;
		   case 5:dayString= "Friday";break;
		   case 6:dayString= "Saturday";break;
		   
		  }
		  System.out.print(dayString);
	}

}
