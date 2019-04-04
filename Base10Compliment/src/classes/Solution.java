package classes;

/*
 * Runtime: 1 ms, faster than 32.86% of Java online submissions for Complement of Base 10 Integer.
 * Memory Usage: 31.8 MB, less than 100.00% of Java online submissions for Complement of Base 10 Integer.
 */
public class Solution {

	public int bitwiseComplement(int N) {
		char[] bits = Integer.toBinaryString(N).toCharArray();
		for(int i=0;i<bits.length;i++) {
			if(bits[i]=='1') bits[i]='0';
			else bits[i]='1';
		}
		String answerStr = String.valueOf(bits);
		int answer = Integer.parseInt(answerStr,2);
		return answer;
    }
}