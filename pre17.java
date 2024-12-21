class student extends pre14{
  int enrollment=7006;
  void display()
  {
    System.out.println("student enrollment is::"+enrollment);
  }
  public static void main(String [] args) {
    student s1=new student();
    s1.display();
    pre14 s=new pre14();
    s.display();
  }
}
class pre14{
  String name="keyur";
  void display()
  {
    System.out.println("student name is::"+name);
  }
}
