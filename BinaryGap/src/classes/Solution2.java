package classes;

/*
 * 868
 * rats, this submission had an error
 * this submission beat 83.71% 
 */
public class Solution2 {

	public int binaryGap(int N) {
		if(N==0) return 0;
		int currentCount = -1;
        int maxCount = 0;
        int oneCount = 0;
        boolean found1 = false;
        while(N>0) {
        	switch(N%2) {
        	case 0:	if(found1) currentCount++;
        			break;
        	default: found1 = true;
        			 currentCount++;
        			 maxCount=Math.max(currentCount, maxCount);
        			 currentCount=0;
        			 oneCount++;
        	}
        	N/=2;
        }
        if(oneCount==1) return 0;
        return maxCount;
    }
}
