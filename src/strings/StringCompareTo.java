package strings;

import java.util.Scanner;
public class StringCompareTo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a First String: ");
		String s1 = scan.nextLine();
		System.out.print("Enter a Second String: ");
		String s2 = scan.nextLine();
		int result = s1.compareTo(s2);
		System.out.print(result);
		scan.close();
		 }
	}
