package strings;

import java.util.Scanner;
public class StringStartsEndsWith {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.print("Prefix: ");
		String pre = scan.nextLine();
		System.out.print("Suffix: ");
		String suff = scan.nextLine();
		System.out.println("Starts With: " +s1.startsWith(pre));
		System.out.println("Ends With: " +s1.endsWith(suff));
		scan.close();
		 }
	}
