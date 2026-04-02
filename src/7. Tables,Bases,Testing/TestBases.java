/*
	TestBases.java
	Last modified by j.finn: 28-Mar-2026
	Functions to test the functions toBase and StrToInt in Bases.java.
 */
public class TestBases
{
	static int failures = 0; // total test failures
	
	/*
		run one test of toBase.
		n is the number.
		base is the base
		expected is the String result we expect toBase to return
	 */
	public static void oneToBaseTest(int n, int base, String expected)
	{
		String result = Bases.toBase(n, base);	// calling function in other class
		if (!result.equals(expected))
		{
			failures++;
			System.out.println("Bug: tobase(" + n + ", " + base + "), result = "
				+ result + ", expected " + expected);
		}
	}
	
	public static void TestToBase()
	{
		int [] nums = {9578, 20, 100, 100, 100, 100, 127, 127, 127, 127};
		int [] bases = {10, 2, 2, 8, 10, 16, 2, 8, 10, 16};
		String [] expected = {"9578", "10100", "1100100", "144", "100",
			"64", "1111111", "177", "127", "7F"};
		for (int i = 0; i < nums.length; i++)
			oneToBaseTest(nums[i], bases[i], expected[i]);
	}	
	
	/*
		run one test of strToInt.
		n is the number String.
		base is the base
		expected is the int result we expect strToInt to return
	 */
	public static void oneStrToIntTest(String n, int base, int expected)
	{
		int result = Bases.strToInt(n, base);	// calling function in other class
		if (result != expected)
		{
			failures++;
			System.out.println("Bug: tobase(" + n + ", " + base + "), result = "
				+ result + ", expected " + expected);
		}
	}
	
	public static void TestStrToInt()
	{
		String [] nums = {"1000", "1000", "1000", "1000"};
		int [] bases = {2, 10, 8, 16};
		int [] expected = {8, 1000, 512, 4096};
		for (int i = 0; i < nums.length; i++)
			oneStrToIntTest(nums[i], bases[i], expected[i]);
	}	
	
    public static void main(String[] args) 
    {
		TestToBase();
		TestStrToInt();
		if (failures == 0)
			System.out.println("All tests passed");
	}
}
