package tapacademy.com;
class Bank
{
	private int bal;
	
	public void setBalance(int x)
	{
		bal = x;
	}
	public int getBalance()
	{
		return bal;
	}
}

public class Seetha {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setBalance(120000);
		System.out.println(b.getBalance());

	}

}
