package twodarrays;

import java.util.Scanner;
public class MatrixAddition{
public static void main(String[] args) {
	int [][] mat1 = new int [3][3];
	int [][] mat2 = new int [3][3];
	int [][] res = new int [3][3];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the elements in your matrix 1: ");
	for(int i = 0; i<mat1.length;i++) {
		for(int j = 0; j<mat1.length;j++) {
			mat1[i][j] = scan.nextInt();
		}
	}
	System.out.println("Enter the elements in your matrix 2: ");
	for(int i = 0; i<mat2.length;i++) {
		for(int j = 0; j<mat2.length;j++) {
			mat2[i][j] = scan.nextInt();
		}
	}
	System.out.println("Result: ");
	int sum = 0;
	for(int i = 0; i<res.length;i++) {
		for(int j = 0; j<res.length;j++) {
			sum = mat1[i][j] + mat2[i][j];
			System.out.print(sum+" ");
		}
		System.out.println();
	}
}
}




