package strings;

import java.util.Scanner;
public class StringIndexOf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.print("Enter a Charecter: ");
		String c = scan.nextLine();
		System.out.println("First Occurence: " +s1.indexOf(c));
		scan.close();
		 }
	}
