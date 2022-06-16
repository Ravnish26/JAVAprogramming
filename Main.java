interface Sum {
public int sum(int num1, int num2);
}

class Main {
public static void main(String args[]) {
Sum sum1 = (num1, num2) -> (num1 + num2); 
System.out.println("Sum = " + sum1.sum(180, 240));
}
}
