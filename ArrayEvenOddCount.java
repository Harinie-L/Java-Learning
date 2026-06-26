import java.util.Scanner;
public class ArrayEvenOddCount{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.print("Enter your marks: ");
		for(int i = 0; i<marks.length;i++) {
		marks[i] = scan.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for(int i = 0; i<marks.length;i++) {
			if(marks[i] % 2 == 0) {
				evenCount = evenCount+1;
			}	
			else {
				oddCount = oddCount+1;
			}
	}
		System.out.println("Even Count: " +evenCount);
		System.out.println("Odd Count: " +oddCount);
}
}
