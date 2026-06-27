package arrays;

import java.util.Scanner;
public class ArrayAverage{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		int sum = 0;
		double average = 0;
		System.out.print("Enter your marks: ");
		for(int i = 0; i<marks.length;i++) {
		marks[i] = scan.nextInt();
		}
		for(int i = 0; i<marks.length;i++) {
			sum = sum+marks[i];
			}
		average = sum/marks.length;
		System.out.println("Summation of your Marks: " +sum);
		System.out.println("Average of your Marks: " +average);
		
	}
}