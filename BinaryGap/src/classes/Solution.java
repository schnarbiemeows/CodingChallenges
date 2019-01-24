package classes;

/*
 * 868
 * rats, first submission had an error
 * second submission only beat 15.34% need to find a better solution
 */
public class Solution {

	public int binaryGap(int N) {
		if(N==0) return 0;
		char[] binaries = Integer.toBinaryString(N).toCharArray();
		int length = binaries.length;
		int end = length-1;
		while(binaries[end]!=49) {
			end--;
		}
		if(end==0) return 0;
		int currentCount = 1;
        int maxCount = 1;
        for(int i=end;i>=0;i--) {
        	switch(binaries[i]) {
        	case 48:	currentCount++;
        			break;
        	default: maxCount=Math.max(currentCount, maxCount);
        			 currentCount=1;
        	}
        }
        return maxCount;
    }
}
