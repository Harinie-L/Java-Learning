import java.util.Scanner;
public class ArrayReversePrint{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.print("Enter your marks: ");
		for(int i = 0; i<marks.length;i++) {
		marks[i] = scan.nextInt();
		}
		System.out.print("Reversed Order: ");
		for(int i = marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}
}
}
