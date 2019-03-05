package classes;

/*
 * 788
 * Runtime: 7 ms, faster than 56.37% of Java online submissions for Rotated Digits.
 * Memory Usage: 36.4 MB, less than 45.56% of Java online submissions for Rotated Digits.
 */
public class Solution3 {

	public int rotatedDigits(int N) {
		int counter = 0;
        for(int i=1;i<=N;i++) {
        	boolean has2569 = false;
        	boolean has347 = false;
        	int item = i;
        	while(item>0) {
        		switch(item%10) {
        			case 2 : has2569=true;
        			 		 break;
        			case 5 : has2569=true;
   				 			 break;
        			case 6 : has2569=true;
   				 			 break;
        			case 9 : has2569=true;
   				 			 break;
        			case 3 : has347=true;
   				 			 break;
        			case 4 : has347=true;
			 			     break;
        			case 7 : has347=true;
			 			 	 break;
			 	    default: ;
        		}
        		item = item/10;
        	}
        	if(has2569&&!has347)counter++;
        }
        return counter;
    }
}
