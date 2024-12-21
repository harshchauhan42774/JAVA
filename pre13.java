class pre13{
  public static void main(String[] args) {
    String l="keyur";
    System.out.println("value of charAT::"+l.charAt(2));
    System.out.println("value of contains::"+l.contains("z"));
    String l1=String.format("name is %s",l);
    System.out.println("value of formate::"+l1);
    System.out.println("value of length::"+l.length());
    String[] arr=l.split("k",2);
    for(String a : arr)
    {
        System.out.println("value of split::"+a);
    }
  }
}
