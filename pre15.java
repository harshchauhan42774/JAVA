class student extends books{
  void display()
  {
    System.out.println("student name is::"+name);
    System.out.println("student enrollment is::"+enrollment);
    System.out.println("student bookname is::"+bookname);
  }
  public static void main(String [] args) {
    student s1=new student();
    s1.display();
  }
}
class books extends pre15{
  String bookname="aoop";
}
class pre14 {
  String name="keyur";
  int enrollment=7006;
}
