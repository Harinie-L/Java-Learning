package basics;

import java.util.Scanner;
public class LargestOfTwo{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	    System.out.print("Enter a value for A: ");
	    int A = scan.nextInt();
	    System.out.print("Enter a value for B: ");
	    int B = scan.nextInt(); 
	    if(A >B) {
	    	System.out.print(+A+ " is the largest");
	    }
	    else {
	    	System.out.print(+B+ " is the largest");
	    }
	}
}