import java.util.Scanner;
public class StringTrim {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.println("Original String: " +s1);
		System.out.println("Updated String: " +s1.trim());
		scan.close();
		 }
	}
