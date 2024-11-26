package tapacademy.com;
class Test{
		int x;
		int y;
		public void fun1()
		{
		 System.out.println("fun1");
			}
}
class Demo2 extends Test
{
	 
}


	

public class Demo {

	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
		System.out.println(d.x);
		System.out.println(d.y);
		d.fun1();
	}

}
