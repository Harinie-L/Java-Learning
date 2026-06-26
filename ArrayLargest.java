import java.util.Scanner;
public class ArrayLargest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.print("Enter your marks: ");
		for(int i = 0; i<marks.length;i++) {
		marks[i] = scan.nextInt();
		}
		int largest = marks[0];
		for(int i = 0; i<marks.length;i++) {
			if(largest < marks[i]) {
				largest = marks[i];
			}	
	}
		System.out.print("Largest: " +largest);
}
}
