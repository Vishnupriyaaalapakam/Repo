package tapacademy.com;
class Test1
{
	int x;
	int y;
	void disp1()
	{
		System.out.println("fun1");
	}
}
	class Test2 extends Test1
	{
		void disp2()
		{
			System.out.println("fun2");
		}
	}
	class Test3 extends Test2
	{
		void disp3()
		{
			System.out.println("fun3");
		}
	}


public class Multi {

	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.disp1();

	}

}
