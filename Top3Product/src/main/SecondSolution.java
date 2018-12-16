package main;

public class SecondSolution {

	// O(N) solution
	//  ha, this one only beat 72.43% of submissions! My first one was better!
	// but I only had to test this once locally and then it passed on first submission
	public int maximumProduct(int[] nums) {

		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		int thirdmax = Integer.MIN_VALUE;
		int lowestneg = Integer.MAX_VALUE;
		int nextlowestneg = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				thirdmax = secondmax;
				secondmax = max;
				max = nums[i];
			} else if (nums[i] > secondmax) {
				thirdmax = secondmax;
				secondmax = nums[i];
			} else if (nums[i] > thirdmax) {
				thirdmax = nums[i];
			}
			if (nums[i] < 0) {
				if (nums[i] < lowestneg) {
					nextlowestneg = lowestneg;
					lowestneg = nums[i];
				} else if (nums[i] < nextlowestneg) {
					nextlowestneg = nums[i];
				}
			}
		}
		if (lowestneg < 0 && nextlowestneg < 0) {
			return Math.max(max * lowestneg * nextlowestneg, max * secondmax * thirdmax);
		}
		return max * secondmax * thirdmax;
	}
}
