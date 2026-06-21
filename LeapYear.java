import java.util.Scanner;
public class LeapYear{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();
		if(year % 400 == 0 || year % 4 == 0 && year % 100!= 0) {
			System.out.print(+year+ " Is a Leap Year");
		}
		else {
			System.out.print(+year+ " Is not a Leap Year");
		}
	}
}
