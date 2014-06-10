package codingbat.warmup1;

public class HasTeen
{
	public static void main(String[] args) 
	{
	}

	/**
	 * We'll say that a number is "teen" if it is 
	 * in the range 13..19 inclusive. 
	 * Given 3 int values, return true if 1 or more of them are teen.
	 *
	 * hasTeen(13, 20, 10) → true
	 * hasTeen(20, 19, 10) → true
	 * hasTeen(20, 10, 13) → true
	 */
	public boolean isTeen(int a)
	{
		return a >= 13 && a <= 19;
	}

	public boolean hasTeen(int a, int b, int c)
	{
		return isTeen(a) || isTeen(b) || isTeen(c);
	}
}	
