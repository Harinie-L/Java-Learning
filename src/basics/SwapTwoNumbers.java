package basics;

import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	    System.out.print("Enter a value of A: ");
	    int num1 = scan.nextInt();
	    System.out.print("Enter a value of B: ");
	    int num2 = scan.nextInt();
	    int temp = num1;
	    num1 = num2;
	    num2 = temp;
	    System.out.println("The Value of A is: "+num1);
	    System.out.println("The Value of B is: " +num2);
	}
}
