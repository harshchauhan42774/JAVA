import java.util.Scanner;
public class pra7
{
  public static void main(String args[])
  {
    rectangle r1=new rectangle(55,33);
    r1.display();
  }
}

class rectangle
{
  int width,hight;
  rectangle(int w,int h)
  {
    width=w;
    hight=h;
  }
  void display()
  {
    System.out.println("hight of rectangle is ::"+hight);
    System.out.println("width of rectangle is ::"+width);
  }
}