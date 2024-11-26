package tapacademy.com;


class Padma extends Thread
{
	public void run()
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " is started to execute");
		
		System.out.println(t1.getName() + " is executing");
		
		System.out.println(t1.getName() + " is  executing");
		
		System.out.println(t1.getName() + " is executing");
		
		System.out.println(t1.getName() + " is executed");
		
		
	}
}













class Pror
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName()+ " started to execute");
		System.out.println(t.getName()+ " started to executing");
		System.out.println(t.getName()+ " started to executing");
		
		Padma p = new Padma();
		p.start();
		try {
			p.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(p.isAlive());
		
		System.out.println(t.getName()+ " started to executing");
		System.out.println(t.getName()+ " started to executing");
		System.out.println(t.getName()+ " started to executed");
		
		
	}
}
