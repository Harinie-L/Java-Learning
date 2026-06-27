package strings;

import java.util.Scanner;
public class StringUpperLowerCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.println("Original String: " +s1);
		System.out.println("Upper Case: " +s1.toUpperCase());
		System.out.println("Lower Case: " +s1.toLowerCase());
		scan.close();
		 }
	}