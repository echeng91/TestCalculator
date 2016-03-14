
public class Calculator {

	public Calculator()
	{

	}

	public String calculateResult(double num1, double num2, int choice)
	{
		double result = 0;
		String calculation;
		switch(choice)
		{
		case 1: result = addition(num1, num2);
		calculation = num1 + " + " + num2 + " = " + result;
		break;
		case 2: result = subtraction(num1, num2);
		calculation = num1 + " - " + num2 + " = " + result;
		break;
		case 3: result = multiplication(num1, num2);
		calculation = num1 + " * " + num2 + " = " + result;
		break;
		case 4: result = division(num1, num2);
		calculation = num1 + " / " + num2 + " = " + result;
		break;
		case 5: result = modulus(num1, num2);
		calculation = num1 + " % " + num2 + " = " + result;
		break;
		default: calculation = "That was not an option.";
		break;
		}
		return calculation;
	}

	public double addition(double num1, double num2)
	{
		return num1 + num2;
	}

	public double subtraction(double num1, double num2)
	{
		return num1 - num2;
	}

	public double multiplication(double num1, double num2)
	{
		return num1 * num2;
	}

	public double division(double num1, double num2)
	{
		return num1 / num2;
	}

	public double modulus(double num1, double num2)
	{
		return num1 % num2;
	}
}
