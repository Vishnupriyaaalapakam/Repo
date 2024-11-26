package tapacademy.com;
class Demo1
{
	int x;
	int y;
	void fun1()
	{
		System.out.println("fun1");
	}
}
class Demo4 extends Demo1
{
	void fun2()
	{
		System.out.println("fun2");
	}
}
class Demo3 extends Demo4
{
	void fun3()
	{
		System.out.println("fun3");
	}
}

public class Inherit {

	public static void main(String[] args) {
		
		Demo3 d3 = new Demo3();
		d3.fun1();
		d3.fun2();
		d3.fun3();


	}

}
