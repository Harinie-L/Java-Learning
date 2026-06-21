import java.util.Scanner;
public class DivisbleBy5And11{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.print(+num+ " Is a Divisible by 5 and 11");
		}
		else {
			System.out.print(+num+ " Is not a Divisible by 5 and 11");
		}
	}
}
