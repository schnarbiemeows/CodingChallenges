package classes;

public class Solution {

	/* 
	 * first submission, no errors, beat 21.54% of submissions
	 * changing it to a swtich/case statement, improves it to 28.31%
	 */
	public boolean judgeCircle(String moves) {
		if(moves==null||moves.isEmpty()) return true;
        int vertical = 0;
        int horizontal = 0;
        for(int i=0;i<moves.length();i++) {
        	char c = moves.charAt(i);
        	switch(c) {
        	case 'U': 
	        		vertical++;
	        		break;
        	case 'D':
	        		vertical--;
	        		break;
        	case 'L':
	        		horizontal++;
	        		break;
        	case 'R':
	        		horizontal--;
	        		break;
        	}
        }
        return vertical==0&&horizontal==0;
    }
}
