class pre19 implements add,sub{
  public void addition(int a,int b)
  {
    int ans=a+b;
    System.out.println("addition is::"+ans);
  }
  public void subtraction(int a ,int b)
  {
    int ans=a-b;
    System.out.println("subtraction is::"+ans);
  }
  public static void main(String[] args) {
    pre19 p=new pre19();
    p.addition(10,5);
    p.subtraction(20,10);
  }
}
interface add {

  void addition(int a,int b);
}
interface sub{
  void subtraction(int a,int b);
}
