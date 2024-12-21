class student extends pre16{
  void display()
  {
    System.out.println("student name is::"+name);
    System.out.println("student enrollment is::"+enrollment);
  }
  public static void main(String [] args) {
    student s1=new student();
    s1.display();
    books s=new books();
    s.print();
  }
}
class books extends pre16{

  void print()
  {
    System.out.println("student bookname is::"+bookname);
  }
}
class pre16 {
  String name="keyur";
  int enrollment=7006;
  String bookname="aoop";
}
