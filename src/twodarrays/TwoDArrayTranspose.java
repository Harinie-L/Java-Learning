package twodarrays;

import java.util.Scanner;
public class TwoDArrayTranspose{
public static void main(String[] args) {
	int [][] marks = new int [3][3];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the elements in your matrix: ");
	for(int i = 0; i<marks.length;i++) {
		for(int j = 0; j<marks.length;j++) {
			marks[i][j] = scan.nextInt();
		}
	}
	System.out.println("Transposed Matrix: ");
	for(int i = 0;i<marks.length;i++) {
		for(int j = 0;j<marks.length;j++) {
			System.out.print(marks[j][i] +" ");
		}
		System.out.println();
	}
}
}



