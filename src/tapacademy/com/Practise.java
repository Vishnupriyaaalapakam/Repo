package tapacademy.com;

class Tharun implements Runnable
{

	@Override
	public void run() {
		for(int i =0 ; i<=10 ; i+= 2)
		{
			System.out.println(i);
		}
		
		
	}
	
}






public class Practise {

	public static void main(String[] args) {
		
		Tharun t = new Tharun();
		Thread t1 = new Thread(t);
		
		t1.start();
	}

}
