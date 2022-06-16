class para {
  String languages;
  para(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
   }
  public static void main(String[] args){
    para obj1 = new para("Java");
    para obj2 = new para("Python");
    para obj3 = new para("C");
  }
}