import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.princeton.cs.introcs.StdOut;

public class PlayWithInheritanceTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test_static_method_override()
	{
		Die die = new CrookedDie1();
		String response = Die.testStatic();
		// this test fails, showing you cannot override a static method
//		assertEquals("fail msg", "CrookedDie1.testStatic()", response);
		
		// this test passes, showing you cannot override a static method
		assertEquals("fail msg", "Die.testStatic()", response);
	}

}
