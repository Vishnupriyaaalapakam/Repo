package tapacademy.com;

import java.util.Scanner;

class Greshu implements Runnable
{
	
	public void run()
	{
		System.out.println("div task strated");
		
			int res = 10/0;
			System.out.println(res);
		System.out.println("div task is completed");
		
	}
	
}

class Priyankshi implements Runnable
{
	public void run()
	{
		System.out.println("Character task started");
		
		for(int i=65 ; i<=75 ; i++)
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
			System.out.println("Character task completed");
	}
}

class Vadhina implements Runnable
{
	public void run()
	{
		System.out.println("Number task is started");
		for(int i=0 ; i<=10 ; i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number task completd");
	}
}




public class ExtendsThread {

	public static void main(String[] args) {
		
		Greshu g = new Greshu();
		Priyankshi p = new Priyankshi();
		Vadhina v = new Vadhina();
		
		Thread t1 = new Thread(g);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(v);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
