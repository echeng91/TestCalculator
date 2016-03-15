import org.junit.* ;
import static org.junit.Assert.* ;

public class DivisionTest {

	@Test
	public void testDivision()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if division is correct.");
		assertTrue(calc.division(4, 5) == 0.8);
	}
	
	@Test
	public void testDivision0()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if division is correct with 0.");
		assertTrue(calc.division(0, 5) == 0);
	}
	
	@Test
	public void testDivisionNegative()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if division is correct with negative.");
		assertTrue(calc.division(4, -5) == -0.8);
	}
	
	@Test
	public void testDivisionNegatives()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if division is correct with negatives.");
		assertTrue(calc.division(-4, -5) == 0.8);
	}
}
