import java.util.Scanner;
public class StringConcat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = scan.nextLine();
		System.out.print("Enter Second String: ");
		String s2 = scan.nextLine();
		System.out.println("Concatenated String: " +s1.concat(s2));
		scan.close();
		 }
	}
