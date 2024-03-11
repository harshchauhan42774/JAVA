import java.util.Scanner;

class pra5
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int  i,n,p,j,flag;
      System.out.println("Enter the n Number: ");
         n=sc.nextInt();
         System.out.println("First "+n+" prime numbers are :-"); 

      p=2;
         i=1; 
         while(i<=n)
         {
            flag=1;
            for(j=2;j<=p-1;j++)
            {
                     if(p%j==0)  
                     {
                        flag=0;
                        break;      
                     }   
            }
                  if(flag==1)
                  {
                        System.out.print(p+" ") ;
                     i++;
                  }
            p++;
         }
   }
}