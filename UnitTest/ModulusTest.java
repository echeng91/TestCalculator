import org.junit.* ;
import static org.junit.Assert.* ;

public class ModulusTest {

	@Test
	public void testModulus()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if modulus is correct.");
		assertTrue(calc.modulus(4,5) == 4);
	}
	
	@Test
	public void testModulus0()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if modulus is correct with 0.");
		assertTrue(calc.modulus(0,5) == 0);
	}
	
	@Test
	public void testModulusNegative()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if modulus is correct with negative.");
		assertTrue(calc.modulus(4,-5) == 4);
	}
	
	@Test
	public void testModulusNegatives()
	{
		Calculator calc = new Calculator();
		System.out.println("Test if modulus is correct with negatives.");
		assertTrue(calc.modulus(-4,-5) == -4);
	}
}
