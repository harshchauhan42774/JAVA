class pre12
{
  String l;
  pre12()
  {
    System.out.println("default constructor started");
  }
  pre12(String l)
  {
    System.out.println(l);
  }
  public static void main(String args[]) {
    pre12 s=new pre12();
    pre12 s1=new pre12("HELLO WORLD");
  }

}
