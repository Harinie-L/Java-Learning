package strings;

import java.util.Scanner;
public class StringSubstring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.println("Enter Starting Index: ");
		int startindex = scan.nextInt();
		System.out.println("SubString: " +s1.substring(startindex));
		
		scan.close();
		 }
	}