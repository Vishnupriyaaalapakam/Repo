package tapacademy.com;

class Karma
{
	int x;
	int y;
	
	public Karma()
	{
		x=100;
		y=200;
	}
	public Karma(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
}
class Karma2 extends Karma
{
	int a;
	int b;
	public Karma2()
	{
		this(9,99);
		a=300;
		b=400;
	}
	public Karma2(int a, int b)
	{
		
		this.a = a;
		this.b =b;
	}
	void dispaly()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}


public class Chain {

	public static void main(String[] args) {
		
		Karma2 k = new Karma2(9,99);
		
		k.dispaly();
		
	}

}
