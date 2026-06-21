import java.util.Scanner;
public class LargestOfThreeNumbers{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a value for A: ");
		int A = scan.nextInt(); 
		System.out.print("Enter a value for B: ");
		int B = scan.nextInt(); 
		System.out.print("Enter a value for C: ");
		int C = scan.nextInt();
		if(A >B && A>C) {
			System.out.print(+A+ " is the largest");
		}
		else if (B > A && B>C){
			System.out.print(+B+ " is the largest");
		}
		else{
			System.out.print(+C+ " is the largest");
		}
	}
}
	
