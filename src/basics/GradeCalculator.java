package basics;

import java.util.Scanner;
public class GradeCalculator{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your Mark: ");
		int mark = scan.nextInt();
		if(mark > 90 && mark <100) {
			System.out.print("A Grade");
		}
		else if (mark >80 && mark < 90) {
			System.out.print("B Grade");
		}
		else if (mark >70 && mark < 80) {
			System.out.print("C Grade");
		}
		else if (mark >60 && mark <70) {
			System.out.print("D Grade");
		}
		else if (mark > 50 && mark <60){
			System.out.print("E Grade");
		}
		else {
			System.out.print("Invalid Input");
		}
	}
}
	
