package classes;

import java.util.Arrays;
import java.util.List;

/*
 * 412
 * OK, minor mistake on line 14 and 15, but first submission beat 89.96%
 */
public class Solution {

	public List<String> fizzBuzz(int n) {
        String[] nums = new String[n];
        for(int i=1;i<=n;i++) {
        	nums[i-1]=i+"";
        }
        for(int j=2;j<n;j+=3) {
        	nums[j]="Fizz";
        }
        for(int j=4;j<n;j+=5) {
        	nums[j]="Buzz";
        }
        for(int j=14;j<n;j+=15) {
        	nums[j]="FizzBuzz";
        }
        return Arrays.asList(nums);
    }
}
