import java.util.Scanner;
public class CountDigits{
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a Set of Number to calculate the length: ");
		int value = scan.nextInt();
		int result = 0;
		while (value != 0) {
			result++;
			value = value/10;
		}
		System.out.print("Length: "+result);
	}
}
