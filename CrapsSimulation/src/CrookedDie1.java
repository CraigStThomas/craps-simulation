
public class CrookedDie1 extends Die
{
	public static String testStatic()
	{
		return "CrookedDie1.testStatic()";
	}
	
	public CrookedDie1()
	{
//		CrapsGame.println("  CrookedDie1's constructor called.");
	}

	public int getLastRoll() // this OVERRIDES (replaces) Die's getLastRoll()
	{
		return 3;
	}

	public String toString() // this OVERRIDES Die's toString()
	{
		return "A CrookedDie1 always rolling 3, and... "; // + super.toString();
	}
}
