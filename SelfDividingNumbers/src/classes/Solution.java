package classes;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	/*
	 * first submission, no errors, beat 35.25% of submissions
	 */
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> answer = new LinkedList<Integer>();
		for(int i=left;i<=right;i++) {
			int j = i;
			boolean valid=true;
			while(valid&&j!=0) {
				int thing = j%10;
				if(thing==0||i%thing!=0) valid=false;;
				j=j/10;
			}
			if(valid) answer.add(i);
		}
		return answer;
    }
}