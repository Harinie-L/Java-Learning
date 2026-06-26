import java.util.Scanner;
public class StringContains {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = scan.nextLine();
		System.out.print("Enter a Word: ");
		String word = scan.nextLine();
		System.out.println("Contains: " +s1.contains(word));
		scan.close();
		 }
	}
