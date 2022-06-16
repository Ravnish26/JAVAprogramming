 class Company {
  String name;
  public Company() {
    name = "Tesla";
  }
}//Public no-arg constructer.
public class noarg {
  public static void main(String[] args) {
    Company obj = new Company();
    System.out.println("Company name = " + obj.name);
  }
}