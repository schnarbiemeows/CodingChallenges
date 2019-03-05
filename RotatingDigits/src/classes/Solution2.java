package classes;

/*
 * 788
 * Runtime: 15 ms, faster than 26.86% of Java online submissions for Rotated Digits.
 * Memory Usage: 37.5 MB, less than 11.11% of Java online submissions for Rotated Digits.
 */
public class Solution2 {

	public int rotatedDigits(int N) {
		int counter = 0;
        for(int i=1;i<=N;i++) {
        	char[] number = String.valueOf(i).toCharArray();
        	boolean has2569 = false;
        	boolean has347 = false;
        	for(int j=0;j<number.length;j++) {
	        	if(number[j]=='2'||number[j]=='5'||
	        			number[j]=='6'||number[j]=='9') has2569=true;
	        	if(number[j]=='3'||number[j]=='4'||number[j]=='7') {
	        		has347=true;
	        		break;
	        	}
        	}
        	if(has2569&&!has347)counter++;
        }
        return counter;
    }
}
