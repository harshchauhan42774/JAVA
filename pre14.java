class student extends pre14{
  void display()
  {
    System.out.println("student name is::"+name);
    System.out.println("student name is::"+enrollment);
  }
  public static void main(String [] args) {
    student s1=new student();
    s1.display();
  }
}
class pre14{
  String name="keyur";
  int enrollment=7006;
}
