import java.util.Scanner;
public class StringSplit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String s1 = scan.nextLine();
		String[] word = s1.split(" ");
		for(int i = 0; i< word.length;i++) {
			System.out.println(word[i]);
		}
		scan.close();
		 }
	}
