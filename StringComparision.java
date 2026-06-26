import java.util.Scanner;
public class StringComparision {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("First String: ");
		String s1 = scan.nextLine();
		System.out.print("Second String: ");
		String s2 = scan.nextLine();
		System.out.println("equals(): " +s1.equals(s2));
		System.out.println("equalsIgnoreCase(): " +s1.equalsIgnoreCase(s2));
		 }
	}
