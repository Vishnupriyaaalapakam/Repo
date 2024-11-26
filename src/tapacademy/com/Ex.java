package tapacademy.com;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		System.out.println("Connection is established");
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scan.nextInt();
		System.out.println("Enter the denominator");
		int b= scan.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int [] ar = new int[size];
		System.out.println("Enter the elements to be stored");
		int ele = scan.nextInt();
		System.out.println("Enter the index of element");
		int in = scan.nextInt();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Dont use zero");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Enter positive size");
		}
		
	
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter limit");
		}
		catch(Exception e)
		{
			System.out.println("invalid input");
		}
		
		System.out.println("Connection is terminated");
		

	}

}
