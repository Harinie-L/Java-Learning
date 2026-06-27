package basics;
import java.util.Scanner;
public class RemainderCalculator{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	    System.out.print("Enter a value for A: ");
	    int num1 = scan.nextInt();
	    System.out.print("Enter a value for B: ");
	    int num2 = scan.nextInt();
	    int result = num1 % num2;
	    System.out.print("The Remainder of " + num1 + " and " + num2 + " is " + result );
	  }
	}
