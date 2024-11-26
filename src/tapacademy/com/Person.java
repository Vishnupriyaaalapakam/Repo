package tapacademy.com;

class Person2
{
	private String name;
	private int age;
	private String country;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCountry()
	{
		return country;
	}
}

public class Person {

	public static void main(String[] args) {
		Person2 p = new Person2();
		{
			p.setName("Ram");
			p.setAge(25);
			p.setCountry("India");
			
			String name = p.getName();
			int age = p.getAge();
			String country = p.getCountry();
			System.out.println("name:" + name);
			System.out.println("age:" + age);
			System.out.println("country:" + country);
		}				
	}

}
