// Java Program to Handle Divide By Zero Exception
import java.io.*;
import java.util.Scanner;
class pre23 {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("
		enter the value of a::");
		int a=s1.nextInt();
		System.out.println("enter the value of b::");
		int b=s2.nextInt();
		try {
			System.out.println(a / b); // throw Exception
		}
		catch (ArithmeticException e) {
			// Exception handler
			System.out.println(
				"Divided by zero operation cannot possible :: "+e);
		}
	}
}
