import org.junit.* ;
import static org.junit.Assert.* ;

public class AdditionTest {

	@Test
	public void testAddition()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if addition is correct.");
		assertTrue(calc.addition(4, 5) == 9);
	}
	
	@Test
	public void testAddition0()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if addition is correct with 0.");
		assertTrue(calc.addition(4, 0) == 4);
	}
	
	@Test
	public void testAdditionNegative()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if addition is correct with negative.");
		assertTrue(calc.addition(4, -5) == -1);
	}
	
	@Test
	public void testAdditionNegatives()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if addition is correct with negative.");
		assertTrue(calc.addition(-4, -5) == -9);
	}
}
