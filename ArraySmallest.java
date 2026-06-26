public class ArraySmallest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.print("Enter your marks: ");
		for(int i = 0; i<marks.length;i++) {
		marks[i] = scan.nextInt();
		}
		int smallest = marks[0];
		for(int i = 0; i<marks.length;i++) {
			if(smallest > marks[i]) {
				smallest = marks[i];
			}	
	}
		System.out.print("Smallest: " +smallest);
}
}
