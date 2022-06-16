import java.util.Scanner;

class NEW {
 public static void main(String[] args) {
    int i = 0, j = 5; 

    do { 

        i++; 

        if (j-- < i++) { 

            break; 

        } 

    } while (i < 5); 

      System.out.println(i + "" + j);
  }
 }