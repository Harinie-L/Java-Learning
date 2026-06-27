package basics;

import java.util.Scanner;
public class EvenOrOdd{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	    System.out.print("Enter a number to check if it is Even or Odd: ");
	    int num1 = scan.nextInt();
	    if(num1 % 2 == 0) {
	    	System.out.print("You have entered an Even Number");
	    }
	    else {
	    	System.out.print("You have entered an Odd Number");
	    }
	}
}

