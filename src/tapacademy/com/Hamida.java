package tapacademy.com;

class Parent
{
	int a;
	int b;
}
class Child extends Parent
{
	
}
public class Hamida
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.a = 100;
		c.b = 200;
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
