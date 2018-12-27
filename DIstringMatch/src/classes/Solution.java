package classes;

public class Solution {

	/*
	 * 1st submission = fail, because I misunderstood the problem
	 * permutation --> means a set of numbers, so all the elements
	 * of output have to be unique, so I can reuse them
	 */
	public int[] diStringMatch(String S) {
        int[] output = new int[S.length()+1];
        int min = 0;
        int max = S.length();
        for(int i=0;i<S.length();i++) {
        	switch(S.charAt(i)) {
        	case 'I' :
        		output[i]=min;
        		min++;
        		break;
        	case 'D' :
        		output[i]=max;
        		max--;
        	}
        }
        output[S.length()]=max;
        return output;
    }
}
