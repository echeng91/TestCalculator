import org.junit.* ;
import static org.junit.Assert.* ;

public class CalculatorTest {

	@Test
	public void testAddition()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if addition is correct.");
		assertTrue(calc.addition(4, 5) == 9);
	}
	
	@Test
	public void testSubtraction()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if subtraction is correct");
		assertTrue(calc.subtraction(4, 5) == -1);
	}
	
	@Test
	public void testMultiplication()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if multiplication is correct.");
		assertTrue(calc.multiplication(4, 5) == 20);
	}
	
	@Test
	public void testDivision()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if division is correct.");
		assertTrue(calc.division(4, 5) == 0.8);
	}
	
	@Test
	public void testModulus()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if modulus is correct.");
		assertTrue(calc.modulus(4,5) == 4);
	}
	
	@Test
	public void testCalculate1()
	{
		Calculator calc = new Calculator();
		System.out.println("Test calculateResults choice 1");
		assertTrue(calc.calculateResult(4, 5, 1).equals("4.0 + 5.0 = 9.0"));
	}

	@Test
	public void testCalculate2()
	{
		Calculator calc = new Calculator();
		System.out.println("Test calculateResults choice 2");
		assertTrue(calc.calculateResult(4, 5, 2).equals("4.0 - 5.0 = -1.0"));
	}

	@Test
	public void testCalculate3()
	{
		Calculator calc = new Calculator();
		System.out.println("Test calculateResults choice 3");
		assertTrue(calc.calculateResult(4, 5, 3).equals("4.0 * 5.0 = 20.0"));
	}

	@Test
	public void testCalculate4()
	{
		Calculator calc = new Calculator();
		System.out.println("Test calculateResults choice 4");
		assertTrue(calc.calculateResult(4, 5, 4).equals("4.0 / 5.0 = 0.8"));
	}

	@Test
	public void testCalculate5()
	{
		Calculator calc = new Calculator();
		System.out.println("Test calculateResults choice 5");
		assertTrue(calc.calculateResult(4, 5, 5).equals("4.0 % 5.0 = 4.0"));
	}

	@Test
	public void testCalculate6()
	{
		Calculator calc = new Calculator();
		System.out.println("Test calculateResults choice 6");
		assertTrue(calc.calculateResult(4, 5, 6).equals("That was not an option."));
	}
}
