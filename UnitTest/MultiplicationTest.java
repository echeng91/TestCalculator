import org.junit.* ;
import static org.junit.Assert.* ;

public class MultiplicationTest {

	@Test
	public void testMultiplication()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if multiplication is correct.");
		assertTrue(calc.multiplication(4, 5) == 20);
	}
	
	@Test
	public void testMultiplication0()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if multiplication is correct with 0.");
		assertTrue(calc.multiplication(4, 0) == 0);
	}
	
	@Test
	public void testMultiplicationNegative()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if multiplication is correct with negative.");
		assertTrue(calc.multiplication(4, -5) == -20);
	}
	
	@Test
	public void testMultiplicationNegatives()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if multiplication is correct with negatives.");
		assertTrue(calc.multiplication(-4, -5) == 20);
	}
}
