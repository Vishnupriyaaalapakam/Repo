package tapacademy.com;

import java.util.Scanner;

public class Multithread {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Addition task started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition task completed");
		
		System.out.println("Character task started");
		for(int i =65;i<=75;i++)
		{
			System.out.println((char)i);
			
			Thread.sleep(1000);
		}
		System.out.println("Character task completed");
		
		
		System.out.println("Number task started");
		 
		for(int i=0 ; i<=11 ; i++)
		{
			System.out.println(i);
			
			Thread.sleep(1000);
			
		}
		
		System.out.println("Number task completed");

	}

}
