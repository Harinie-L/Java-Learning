package strings;

import java.util.Scanner;
public class StringStartEndIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.print("Starting Index: ");
		int startindex = scan.nextInt();
		System.out.print("Ending Index: ");
		int endindex = scan.nextInt();
		System.out.println("Substring: " +s1.substring(startindex,endindex));
		
		scan.close();
		 }
	}