package tapacademy.com;

class Plane
{
	public void takeOff()
	{
		System.out.println("Plane is taking off");
		
	}
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void land()
	{
		System.out.println("Plane is landing");
	}
}
class Cargo extends Plane
{
	public void fly()
	{
		System.out.println("Cargo plane is flying at low height");
	}
	public void carry()
	{
		System.out.println("carrying cargos");
	}
}
class Passengers extends Cargo
{
	public void fly()
	{
		System.out.println("Passengers plane is flying at medium height");
	}
	public void carry()
	{
		System.out.println("carrying Passengers");
	}
}
class Fighter 
{
	public void fly()
	{
		System.out.println("Fighter plane is flying at high height");
	}
	public void carry()
	{
		System.out.println("carrying Fighters");
	}
}


public class Method {

	public static void main(String args[])
	{
		Fighter f = new Fighter();
		f.fly();
		f.carry();
		f.takeOff();
		f.land();
	}
}
