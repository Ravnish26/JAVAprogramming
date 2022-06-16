import java.util.Scanner; 
class scanner {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String Name;
    System.out.println("Enter Name"); 
    Name = myObj.nextLine();          
    System.out.println("Name : " + Name);        
  }
}
