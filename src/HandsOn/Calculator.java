package HandsOn;

public class Calculator {

	public static void main(String[] args) {
		CalcFn obj=new CalcFn();
		obj.add(20, 4);
		obj.diff(45, 5);
		obj.mult(50,2);
		obj.div(10,4);

		obj.add(40.55,5.4);
		obj.diff(60.5,7.3);
		obj.mult(56.5,8.5);
		obj.div(78.5,7.5);

	}

}

class CalcFn
{
	void add(int a, int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	void add(double a, double b)
	{
		System.out.println("Addition: "+(a+b));
	}
	void diff(int a, int b)
	{
		System.out.println("Subtraction: "+(a-b));
	}
	void diff(double a, double b)
	{
		System.out.println("Subtraction: "+(a-b));
	}
	void mult(int a, int b)
	{
		System.out.println("Multiplication: "+(a*b));
	}
	void mult(double  a, double b)
	{
		System.out.println("Multiplication: "+(a*b));
	}
	void div(int a, int b)
	{
		System.out.println("Division: "+(a/b));
	}
	void div(double a, double b)
	{
		System.out.println("Division: "+(a/b));
	}
}