import java.util.Scanner;
public class ArrayInput{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.print("Enter your marks: ");
		for(int i = 0; i< marks.length;i++) {
	    marks[i] = scan.nextInt();
		}
		System.out.print("Your marks: ");
		for(int i = 0; i< marks.length;i++) {
			System.out.println(marks[i]);
		}
		
	}
}
