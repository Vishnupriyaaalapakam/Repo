package tapacademy.com;

class Employee1
{
	private int EmployeeId;
	private String EmployeeName;
	private double EmployeeSalary;
	
	public Employee1()
	{
		EmployeeId = 4;
		EmployeeName="Ganga";
		EmployeeSalary=55000.0;
	}

	public Employee1(int EmployeeId,String EmployeeName,double EmployeeSalary)
	{
		this();
		
	}
	public int getEmployeeId()
	{
		return EmployeeId;
	}
	public String getName()
	{
		return EmployeeName;
	}
	public double getSalary()
	{
		return EmployeeSalary;
	}
	
}

public class Employee {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(2,"arul",56000.0);
		int id1 = e1.getEmployeeId();
		String name1 = e1.getName();
		double salary1 = e1.getSalary();
		System.out.println("id:"+ id1);
		System.out.println("name:" + name1);
		System.out.println("salary:" + salary1);
		
			

	}

}
