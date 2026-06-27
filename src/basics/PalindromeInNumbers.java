package basics;

import java.util.Scanner;
public class PalindromeInNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
        int value = scan.nextInt();
        int original = value;
        int rev = 0;
        while (value != 0) {
            int digit = value % 10;
            rev = rev * 10 + digit;
            value = value / 10;
        }
        if (original == rev) {
        	System.out.print ("It is a Palindrome");
        }
        else {
        	System.out.print("It is not a Palindrome");
        }
}
}