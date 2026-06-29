package twodarrays;

import java.util.Scanner;
public class TwoDArraySum {
public static void main(String[] args) {
	int [][] marks = new int [3][3];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the elements in your matrix: ");
	for(int i = 0; i<marks.length;i++) {
		for(int j = 0; j<marks.length;j++) {
			marks[i][j] = scan.nextInt();
		}
	}
	System.out.println("Matrix:");
	for(int i = 0;i<marks.length;i++) {
		for(int j = 0;j<marks.length;j++) {
			System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	}
	int sum = 0;
	for(int i = 0;i<marks.length;i++) {
		for(int j = 0;j<marks.length;j++) {
			sum = sum+marks[i][j];
		}
	}
	System.out.println("Sum of elements in an array:  "+sum);	
}
}

