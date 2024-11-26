package tapacademy.com;

abstract class Plane2
{
	  public void takeOff()
	  {
		  System.out.println("Plane is takingOff");
	  }
	
	 public void fly()
	 {
		 System.out.println("Plane is flying");
	 }
	
	 public abstract void land();
	}

class CargoPlane2 extends Plane2
{
	@Override
	public void takeOff()
	{
		System.out.println("CargoPlane is takingOff");
	}
	@Override
	public void fly()
	{
		System.out.println("CargoPlane is flying at low height");
	}
	@Override
	public void land()
	{
		System.out.println("CargoPlane is landing");
	}

}
class PassengerPlane2 extends Plane2
{
	@Override
	public void takeOff()
	{
		System.out.println("PassengerPlane is takingOff");
	}
	@Override
	public void fly()
	{
		System.out.println("PassengerPlane is flying at medium height");
	}
	@Override
	public void land()
	{
		System.out.println("PassengerPlane is landing");
	}

}
class FighterPlane2 extends Plane2
{
	@Override
	public void land()
	{
		System.out.println("FighterPlane is landing");
	}

}


public class Main3 {
	
	public static void main(String args[])
	{
		Plane2 fp = new FighterPlane2();
		fp.takeOff();
		fp.fly();
		fp.land();
		
	}

}
