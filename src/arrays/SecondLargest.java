package arrays;

import java.util.Scanner;
public class SecondLargest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.print("Enter the numbers: ");
		for(int i = 0; i<marks.length;i++) {
		marks[i] = scan.nextInt();
		}
		int largest = marks[0];
		int secondlargest = marks[0];
		for(int i = 0;i<marks.length;i++) {
			if(marks[i] > largest ) {
				secondlargest = largest;
				largest = marks[i];
				}
			else if(marks[i] < largest && marks[i] > secondlargest) {
				secondlargest = marks[i];
			}
			}
		System.out.println("Largest: " +largest);
		System.out.println("Second Largest: " +secondlargest);
		}
}