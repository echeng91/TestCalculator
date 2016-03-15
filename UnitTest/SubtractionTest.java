import org.junit.* ;
import static org.junit.Assert.* ;

public class SubtractionTest {

	@Test
	public void testSubtraction()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if subtraction is correct.");
		assertTrue(calc.subtraction(4, 5) == -1);
	}
	
	@Test
	public void testSubtraction0()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if subtraction is correct with 0.");
		assertTrue(calc.subtraction(4, 0) == 4);
	}
	
	@Test
	public void testSubtractionNegative()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if subtraction is correct with negative.");
		assertTrue(calc.subtraction(4, -5) == 9);
	}
	
	@Test
	public void testSubtractionNegatives()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if subtraction is correct with negatives.");
		assertTrue(calc.subtraction(-4, -5) == 1);
	}
}
