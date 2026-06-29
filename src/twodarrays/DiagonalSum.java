package twodarrays;

import java.util.Scanner;
public class DiagonalSum{
public static void main(String[] args) {
	int [][] mat1 = new int [3][3];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the elements in your matrix: ");
	for(int i = 0; i<mat1.length;i++) {
		for(int j = 0; j<mat1.length;j++) {
			mat1[i][j] = scan.nextInt();
		}
	}
		int sum = 0;
		for(int i = 0; i<mat1.length;i++) {
			for(int j = 0; j<mat1.length;j++) {
				if(i == j){
					sum = sum + mat1[i][j];
				}	
			}
		}
	System.out.print("Diagonal Sum: " +sum);
}
}







