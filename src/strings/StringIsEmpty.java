package strings;

import java.util.Scanner;
public class StringIsEmpty {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.println("Is Empty: " +s1.isEmpty());
		scan.close();
		 }
	}
