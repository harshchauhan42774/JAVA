import java.util.Scanner;
class Pra2 
{
    public
     static void main(String[] args) {     
        System.out.println("Chauhan Harsh (226090307010)");
        System.out.println("practical 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        if (a > b && a > c) 
        {
            System.out.println("A is greater:"+a);
        } 
        else if (b > a && b > c) 
        {
            System.out.println("B is greater:"+b);
        } 
        else 
        {
            System.out.println("C is greater:"+c);
        }
}
}