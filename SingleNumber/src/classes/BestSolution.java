package classes;

/*
 * 136
 * this is the best solution, ^ means bit XOR, so any number bit XOR with itself = 0 always
 * genius
 */
public class BestSolution {

	public int singleNumber(int[] nums) {
		int res = nums[0];
	    for (int i = 1; i < nums.length; i++)
	        res = res ^ nums[i];
	    return res;  
    }
}
