import java.util.Scanner;
class pre4 {
  public static void main(String args[])
  {
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int ans[][]=new int[3][3];
    Scanner s1=new Scanner(System.in);
    System.out.println("Chauhan Harsh (226090307010)");
    System.out.println("practical 4");
    System.out.println("enter elements of matrix a::");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.println("array at ["+i+"] ["+j+"]");
        a[i][j]=s1.nextInt();

      }
    }
  System.out.println("array of elements a are::");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.print(" "+a[i][j]+" ");

      }
      System.out.println("");
    }


    System.out.println("enter elements of matrix b::");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.println("array at ["+i+"] ["+j+"]");
        b[i][j]=s1.nextInt();

      }
    }
  System.out.println("array of elements b are::");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.print(" "+b[i][j]+" ");

      }
      System.out.println("");
    }


    System.out.println("array of elements a and b sum are::");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          ans[i][j]=a[i][j]+b[i][j];
          System.out.print(" "+ans[i][j]+" ");

        }
        System.out.println("");
      }

  }
}
