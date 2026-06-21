import java.util.Scanner;
public class VotingEligiblity{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your Age: ");
		int age = scan.nextInt();
		if(age > 18) {
			System.out.print("You're Eligible for Voting");
		}
		else{
			System.out.print("You're not eligible for Voting");
		}
	}
}
