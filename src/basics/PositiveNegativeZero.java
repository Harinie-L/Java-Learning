package basics;

import java.util.Scanner;
public class PositiveNegativeZero{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	    System.out.print("Enter a number: ");
	    int num = scan.nextInt();
	    if(num >0) {
	    	System.out.print("You have entered a Positive Number");
	    }
	    else if (num <0) {
	    	System.out.print("You have entered a Negative Number");
	    }
	    else {
	    	System.out.print("You have entered Zero");
	    }
	}
}