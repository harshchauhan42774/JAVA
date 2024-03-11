import java.util.Scanner;

class pra3
{
    public static void main(String[] args) 
    {   
        System.out.println("Chauhan Harsh (226090307010)");
        System.out.println("practical 3");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n:");
        int n=sc.nextInt();
        int reverse = 0;
        while (n > 0)
        {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("reverse number:" + reverse) ;
    }  
} 
