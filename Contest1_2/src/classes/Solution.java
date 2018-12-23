package classes;

public class Solution {

	public int maxWidthRamp(int[] A) {
		for(int width = A.length-1; width>0;width--) {
			int start = 0;
			while((start+width)<A.length) {
				if(A[start]<=A[start+width]) {
					return width;
				}
				start++;
			}
		}
		return 0;
	}
        /*int maxWidth = 0;
        int maxleftwidth = 0;
        int maxrightwidth = 0;
        int answer = 0;
        int i = 0;
        int j = A.length-1;
        while(i<j) {
        	if(A[i]<=A[j]) {
        		maxWidth = j-i;
        		break;
        	} else if (((j-i)>1)&&(A[i+1]<=A[j])||(A[i]<=A[j-1])) {
        		maxWidth = j-i-1;
        		break;
        	} else {
        		i++;
        		j--;
        	}
        }
        i = 0;
        j =  A.length-1;
        while(i<j) {
        	if(A[i]<=A[j]) {
	        	maxrightwidth = j-i;
	    		break;
	    	} 
	    	else {
	    		i++;
	    	}
        }
        i = 0;
        j =  A.length-1;
        while(i<j) {
        	
	        if(A[i]<=A[j]) {
	        	maxleftwidth = j-i;
	    		break;
	    	} 
	    	else {
	    		j--;
	    	}
        }
        answer = Math.max(Math.max(maxrightwidth, maxleftwidth),maxWidth);
        return answer;
    }*/
}
