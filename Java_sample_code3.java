public class Main {
  public static void main(String[] args) throws Exception {
    int number = 30;
    for (int i = 0; i <= number; i++) {
      System.out.println(i + ": " + tribonacci(i));
    }
  }
  public static long tribonacci(int num) {
    if (num == 0) {
      return 0;
    }
    if (num == 1) {
      return 0;
    }
    if (num == 2) {
      return 1;
    }
    return  tribonacci(num - 1) + tribonacci(num - 2) + tribonacci(num - 3); // ここを修正
  }
}
