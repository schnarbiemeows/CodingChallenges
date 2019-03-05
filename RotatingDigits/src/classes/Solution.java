package classes;

/*
 * 788
 * Runtime: 15 ms, faster than 26.86% of Java online submissions for Rotated Digits.
 * Memory Usage: 37.4 MB, less than 13.33% of Java online submissions for Rotated Digits.
 */
public class Solution {

	public int rotatedDigits(int N) {
		int counter = 0;
        for(int i=1;i<=N;i++) {
        	String number = String.valueOf(i);
        	if(((number.contains("2")||number.contains("5")||
        	number.contains("6")||number.contains("9")))&&
        	(!(number.contains("3")||number.contains("4")||number.contains("7"))))
        			counter++;
        }
        return counter;
    }
}
