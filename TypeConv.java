class TypeConv {
  public static void main(String[] args) {
   System.out.println("WIDENING Conversion-") ;
    int num = 10;
    System.out.println("The integer value: " + num);
    double data = num;
    System.out.println("The double value: " + data);
    System.out.println("NARROWING Conversion-") ;
    double n = 10.99;
    System.out.println("The double value: " + n);
    int d = (int)n;
    System.out.println("The integer value: " + d);
  }
}