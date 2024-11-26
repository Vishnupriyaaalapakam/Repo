package tapacademy.com;

import java.util.Scanner;
 abstract class Shape2
{
	protected float area;
	
	public abstract void acceptInput();
	public abstract void calcArea();
	public void dispArea()
	{
		System.out.println("area:" + area);
	}
	
}

class Square extends Shape2
{
	private float side;
	
	@Override
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the side:");
		 side = scan.nextFloat();
	}
	@Override
	public void calcArea()
	{
		area = side * side ;
		
	}
	
	
}
class Rectangle extends Shape2
{
	float length;
	float breadth;
	
	@Override
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length:");
		length = scan.nextFloat();
		System.out.println("Enter the breadth:");
		breadth = scan.nextFloat();
	}
	@Override
	public void calcArea()
	{
		area = length * breadth;
	}
	
	
	
}
class Circle extends Shape2
{
	float radius;
	
	@Override
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius = scan.nextFloat();
		
	}
	@Override
	public void calcArea()
	{
		area = 3.142f * radius * radius;
	}
	
}


public class Shape {

	public static void main(String[] args) {
		
		Shape2 c = new Square();
		c.acceptInput();
		c.calcArea();
		c.dispArea();
	}

}
