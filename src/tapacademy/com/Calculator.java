package tapacademy.com;

public class Calculator {
	 int add(int a,int b) {
	 int sum=a+b;
	 return sum;
	 }
	 float add(float a,float b)
	 {
		 float sum=a+b;
		 return sum;
	 }
	 float add(int a,float b,int c)
	 {
		 float sum=a+b+c;
		 return sum;
	 }
	 int add(int a,int b,int c)
	 {
		 int sum=a+b+c;
		 return sum;
	 }
	 double add(double a,double b,double c)
	 {
		 double sum=a+b;
		 return sum;
	 }
	 double add(int a,double b,int c)
	 {
		 double sum=a+b+c;
		 return sum;
	 }
	 float add(float a,float b,int c)
	 {
		 float sum=a+b+c;
		 return sum;
	 }
	 class Demo
	 {
	 public static void main(String args[])
	 {
	Calculator calc = new Calculator();
	System.out.println(calc.add(10, 20));
	 }
	 


	 }
}
