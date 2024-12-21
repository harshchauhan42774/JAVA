class pre8{
  int h;
  int w;
  pre8(int h,int w)
  {

    this.h=h;
    this.w=w;
  }
  void display()
  {
    System.out.println("rectangle of hight is::"+h);
    System.out.println("rectangle of width is::"+w);
  }
  public static void main(String args[])
  {
    pre8 p1=new pre8(55,33);
    p1.display();
  }
}
