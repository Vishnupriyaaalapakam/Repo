package tapacademy.com;

import java.util.Scanner;

class D extends Thread
{
	public void run()
	{
		
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if(name.equals("Thread-0"))
		{
			add();
		}
		
		else if(name.equals("Thread-1"))
		{
			printChar();
		}
		else
		{
			printNum();
		}
		
		
	}
	

	
	
	public void add()
	{
		System.out.println("Addition task started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b= scan.nextInt();
		int c = a+b;
		System.out.println(c);
		System.out.println("Addition task completed");
	}
	
	public void printChar()
	{
		System.out.println("Characters task started");
		for(int i =65 ; i<= 75 ; i++)
		{
			System.out.println((char)i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Characters task completed");
	}
	
	public void printNum()
	{
		System.out.println("Numbers start to execute");
		for(int i =0 ; i<=10 ; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			System.out.println("Numbers task completed");
			
		}
	}
	
}



public class Demo1111 {

	public static void main(String[] args) {
		
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		
		d1.start();
		d2.start();
		d3.start();
		
	}

}
