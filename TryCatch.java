public class TryCatch {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {3, 6, 9};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}