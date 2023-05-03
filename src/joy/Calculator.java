package joy;


public class Calculator {
	int num1,num2;
	
	Calculator(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("Memory allocated to calculator object");
	}
	int Add()
	{
		System.out.println("Executing add method");
		return num1+num2;
	}
	int Sub()
	{
		System.out.println("Executing subtract method");
		return num1-num2;
	}
	int Div()
	{
		System.out.println("Executing Divide method");
		return num1/num2;
	}
boolean validate()
{
	System.out.println("in validate");
	if(num1>2 && num2>2)
	{
		System.out.println("true");
		return true;
	}
	else
	{
		System.out.println("False");
		return false;
	}
}
void reset()
{
	System.out.println("Performing reset");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
