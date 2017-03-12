import ToolKit.QuadraticEquation;
import java.util.Scanner;
public class Exercise9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a, b, c: ");
	        double a = input.nextDouble();
	        double b = input.nextDouble();
	        double c = input.nextDouble();

	        QuadraticEquation equation = new QuadraticEquation(a, b, c);
	        double discriminant = equation.getDiscriminant();

	        if (discriminant > 0) {
	            System.out.println("The roots are " + equation.getRoot1()
	                    + " and " + equation.getRoot2());
	        } else if (discriminant == 0) {
	            System.out.println("The root is " + equation.getRoot1());
	        } else {
	            System.out.println("The equation has no roots");

	        }
	}

}
