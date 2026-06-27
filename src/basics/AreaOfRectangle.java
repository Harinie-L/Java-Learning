package basics;

import java.util.Scanner;
public class AreaOfRectangle{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	    System.out.print("Enter a value of Length: ");
	    int num1 = scan.nextInt();
	    System.out.print("Enter a value of Breadth: ");
	    int num2 = scan.nextInt();
	    int area = num1 * num2;
	    System.out.print("The Area of Recatangle containing values of length " + num1 + " and breadth " + num2 + " is " +area );
	  }
	}
	  