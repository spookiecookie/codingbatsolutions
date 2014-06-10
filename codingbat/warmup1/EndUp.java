package codingbat.warmup1;

public class EndUp
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a new string where the last 3 chars
	 * are now in upper case.
	 * If the string has less than 3 chars,
	 * uppercase whatever is there.
	 * Note that str.toUpperCase() returns the uppercase version
	 * of a string.
	 *
	 * endUp("Hello") → "HeLLO"
	 * endUp("hi there") → "hi thERE"
	 * endUp("hi") → "HI"
	 */
	public String endUp(String str)
	{
		String ret;
		if (3 >= str.length())
		{
			ret = str.toUpperCase();
		}
		else
		{
			ret = str.substring(0, str.length()-3) + str.substring(str.length() - 3, str.length()).toUpperCase();
		}
		return ret;
	}
}
