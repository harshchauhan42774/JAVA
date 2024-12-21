import java.util.Scanner;
class pre24{
  int acnumber;
  float tamount;
  pre24(float tamount){
    this.tamount=tamount;
  }
  void getdata(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter account information::");
    System.out.println("enter account number");
    acnumber=sc.nextInt();
    while (true) {
    System.out.println("enter your choice::\n1:deposit\n2:withdraw\n3:exit");
    int ch = sc.nextInt();
    System.out.println("enter amount");
    float amount=sc.nextFloat();
    switch (ch) {
      case 1:
      tamount=tamount+amount;
      break;

      case 2:
      tamount=tamount-amount;
      break;

      case 3:
      break;

    }
    putdata();
    if (ch == 3) {
      break;

    }

  }
  }
    void putdata()
    {
      if (tamount < 0)
      {
        throw new IllegalArgumentException("::not Sufficent fund::");
      }
      else {
        System.out.println("total amount is :: "+tamount);

      }

  }
  public static void main(String[] args) {
    float amount=0;
    pre24 p=new pre24(amount);
    p.getdata();
    p.putdata();
  }
}
