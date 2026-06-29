package twodarrays;

import java.util.Scanner;
public class TwoDArrayColumnSum {
public static void main(String[] args) {
	int [][] marks = new int [3][3];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the elements in your matrix: ");
	for(int i = 0; i<marks.length;i++) {
		for(int j = 0; j<marks.length;j++) {
			marks[i][j] = scan.nextInt();
		}
	}
	int sum = 0;
	for(int i = 0;i<marks.length;i++) {
		for(int j = 0;j<marks.length;j++) {
			sum = sum+marks[j][i];
		}
		System.out.println("Sum of Column " +(i+1)+ ": "+sum);
		sum = 0;
	}
}
}


