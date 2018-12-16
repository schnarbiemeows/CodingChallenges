package main;

public class Solution {

	// O(3N) solution, but O(2N) storage needed, so, not an in-place solution
	// this solution beat 87.92% of submissions, but I had to submit like 4-5 times
	public int maximumProduct(int[] nums) {

		int[] storage = new int[2001];
		int offset = 1000;
		int posMax = -1;
		boolean not3found = true;
		int greatest3product = 0;
		int posCounts = 3;
		int negCounts = 2;
		boolean not2found = true;
		int greatestTwoProduct = Integer.MIN_VALUE;
		// O(N) here
		for(int i=0; i<nums.length; i++) {
			storage[offset+nums[i]]++;
		}
		
		// O(N) here
		for(int j=2000;j>-1;j--) {
			int counttemp = storage[j];
			while(counttemp>0) {
															//System.out.println("found number : "+(j-offset));
				counttemp--;
				if(posMax==-1) {
					posMax=j-offset;
															//System.out.println("Max set to be : "+(j-offset));
				}
				if(not3found) {
					greatest3product = j-offset;
					not3found = false;
				} else {
					greatest3product = greatest3product*(j-offset);
				}
				posCounts--;
				if(posCounts==0) break;
			}
			if(posCounts==0) break;
		}
															//System.out.println("greatest3product = " + greatest3product);
		// O(N) here 
		for(int k=0;k<1000;k++) {
			int counttemp = storage[k];
			while(counttemp>0) {
															//System.out.println("found number : "+(k-offset));
				counttemp--;
				if(not2found) {
					greatestTwoProduct = k-offset;
					not2found = false;
				} else {
					greatestTwoProduct = greatestTwoProduct*(k-offset);
				}
				negCounts--;
				if(negCounts==0) break;
			}
			if(negCounts==0) break;
		}
															//System.out.println("greatestTwoProduct = " + greatestTwoProduct);
		int results = Math.max(greatest3product, posMax*greatestTwoProduct);
		if(not2found) {
			results = greatest3product;
		}
		return results;
	}
}
