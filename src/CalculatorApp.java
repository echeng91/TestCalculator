import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		try
		{
		System.out.print("What is the the first number? : ");
		double num1 = sc.nextDouble();
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Modulus");
		System.out.print("What do you want to do? : ");
		int choice = sc.nextInt();
		System.out.print("What is the second number ? : ");
		double num2 = sc.nextDouble();
		System.out.println();
		System.out.println(calc.calculateResult(num1, num2, choice));
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Inputs do not match expectations");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error");
		}

		sc.close();
	}

}
