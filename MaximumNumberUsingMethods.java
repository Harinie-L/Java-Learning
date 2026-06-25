public class MaximumNumberUsingMethods {
  public static int max(int a, int b) {
    if(a > b) {
      return a;
    }
    else {
      return b;
    }
  }
  public static void main(String[] args) {
    int result = max(10,20);
    System.out.print(result);
  }
}
