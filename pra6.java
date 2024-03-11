import java.util.Scanner;
class pra6 
{
    public static void main(String[] args) 
    {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.get();
        s2.get();
        s3.get();
        s1.display();
        s2.display();
        s3.display();
    }
}

class student 
{
    int eno;
    String name;

    void display() 
    {
        System.out.println("eno is: " + eno);
        System.out.println("name is: " + name);
    }

    void get() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eno:");
        eno = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
    }
}