package main;

public class Solution {

	// 1. - do a quick sort on the array ----> O(nlogn)
	// 2. iterate through the array and for each #, do a binary search for it's compliment, target-n
	// if -1 Integer.MIN returned, no # is found, should not be needed
	// 3. return the pair of #s
	public int[] twoSum(int[] nums, int target) {
		// we need a backup to of the original indexes
		int[] backup = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			backup[i] = nums[i];
		}
		quickSort(nums,0,nums.length);
		int[] answer = new int[2];
		int[] returnIndexes = new int[2];
		int i = 0;
		int j =nums.length-1;
		while(i<j) {
			int total =nums[i]+nums[j];
			if(total==target) {
				answer[0]=nums[i];
				answer[1]=nums[j];
				break;
			} else if(total>target) {
				j--;
			} else {
				i++;
			}
		}
		for(int x=0;x<answer.length;x++) {
			for(int y=0;y<backup.length;y++) {
				if(backup[y]==answer[x]) {
					returnIndexes[x]=y;
					backup[y]=Integer.MIN_VALUE;
				}
			}
		}
		if(returnIndexes[0]>returnIndexes[1]) {
			int temp = returnIndexes[0];
			returnIndexes[0]=returnIndexes[1];
			returnIndexes[1]=temp;
		}
		return returnIndexes;
	}
	
	public static void quickSort(int[] input, int start, int end) {
		if(end-start<2)
			return;
		int midpoint = pivot(input,start,end);
		quickSort(input,start,midpoint);
		quickSort(input,midpoint+1,end);
	}
	
	public static int pivot(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		while(i<j) {
			while(i<j && input[--j]>=pivot) ;
			if(i<j) {
				input[i] = input[j];
			}
			while(i<j && input[++i]<=pivot) ;
			if(i<j) {
				input[j] = input[i];
			}
		}
		input[j] = pivot;
		return j;
	}
	
	/*public boolean binarySearch(int[] input, int start, int end, int compliment) {
		if(start>=input.length||end<0)
			return false;
		if(start==end) {
			if(input[start]==compliment)
				return true;
			else
				return false;
		}
			int mid = start+(end-start)/2;
			if(input[mid]==compliment)
					return true;
			if(input[mid]>compliment)
				return binarySearch(input,start,mid-1,compliment);
			else
				return binarySearch(input,mid+1,end,compliment);
	}*/
}
