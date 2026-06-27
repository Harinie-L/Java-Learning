package strings;

import java.util.Scanner;
public class StringReplace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.print("Enter a Word to Replace: ");
		String rep = scan.nextLine();
		System.out.print("New Word: ");
		String word = scan.nextLine();
		System.out.println("Updated String: " +s1.replace(rep, word));
		scan.close();
		 }
	}
