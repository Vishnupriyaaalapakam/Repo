package tapacademy.com;
class Customer
{
	private int customerId;
	private String customerName;
	private int customerNumber;
	
	public Customer()
	{
		customerId=7;
		customerName="gangu";
		customerNumber=9097;
	}
	
	public Customer(int customerId,String customerName,int customerNumber)
	{
		this();
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerNumber=customerNumber;
	}
	
		public int getId()
	{
		return customerId;
	}
	public String getName()
	{
		return customerName;
	}
	public int getNum()
	{
		return customerNumber;
	}
	
}
public class Customer2 {

	public static void main(String[] args) {
		Customer c= new Customer(3,"rrr",5768);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getNum());
		
	}

}
