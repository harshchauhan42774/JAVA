er class pre18 extends car{
  pre18(int s,String n){
    super(s,n);
  }
  void display()
  {
      System.out.println("object is::"+this.toString());
  }
  public static void main(String[] args) {

    car c=new car(250,"thar");
    car c1=new car(500,"lemburgini");
    car c2=new car(100,"oddi");
    car c3=new car(200,"i20");
    car c4=new car(300,"kia");
    c.display();
    c1.display();
    c2.display();
    c3.display();
    c4.display();
  }
}
class car{
  int topspeed;
  String name;
  car(int s,String n){
    this.topspeed=s;
    this.name=n;
  }
  void display()
  {
    System.out.println("car topspeed is::"+topspeed);
    System.out.println("car name is::"+name);
    System.out.println("object is::"+this.toString());
  }
}
