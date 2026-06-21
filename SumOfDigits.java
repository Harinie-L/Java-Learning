import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
        int value = scan.nextInt();
        int add = 0;
        int temp = value;
        while (temp != 0) {
            temp = temp / 10;
            add++;
        }
        System.out.println("Number of digits: " + add);
    }
}
