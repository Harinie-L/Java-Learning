package twodarrays;

import java.util.Scanner;
public class TwoDArrayBasics {
public static void main(String[] args) {
	int [][] marks = new int [3][3];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your marks: ");
	for(int i = 0; i<marks.length;i++) {
		for(int j = 0; j<marks.length;j++) {
			marks[i][j] = scan.nextInt();
		}
	}
	for(int i = 0;i<marks.length;i++) {
		for(int j = 0;j<marks.length;j++) {
			System.out.print(marks[i] [j]);
		}
		System.out.println();
	}
}
}
