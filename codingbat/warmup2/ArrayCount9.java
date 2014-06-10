package codingbat.warmup2;

public class ArrayCount9
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return the number of 9's in the array.
	 *
	 * arrayCount9({1, 2, 9}) → 1
	 * arrayCount9({1, 9, 9}) → 2
	 * arrayCount9({1, 9, 9, 3, 9}) → 3
	 */
	public int arrayCount9(int[] nums)
	{
		 int count = 0;
		 for (int i = 0; i < nums.length; i++)
		 {
			 if (9 == nums[i])
			 {
				 count++;
			 }
		 }  
		 return count;
	}
}	
