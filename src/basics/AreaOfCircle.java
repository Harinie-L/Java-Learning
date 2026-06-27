package basics;
import java.util.Scanner;
public class AreaOfCircle{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	    System.out.print("Enter a value of Radius: ");
	    double num2 = scan.nextInt();
	    double area = 3.14 * num2 * num2;
	    System.out.print("The Area of Circle containing values of radius " + num2 + " is " +area );
	  }
	}
