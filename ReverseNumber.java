public class ReverseNumber{
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter a Number to Reverse: ");
        int value = scan.nextInt();
        int reverse = 0;
        while (value != 0) {
        	int digit = value % 10;
        	reverse = reverse * 10 + digit;
        	value = value / 10;
        }
        System.out.println("Reversed Value: " + reverse);
    }
}
