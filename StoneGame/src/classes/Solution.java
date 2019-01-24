package classes;

/*
 * worked! first time! no errors! beat 56.75% of submissions
 */
public class Solution {

	public boolean stoneGame(int[] piles) {
        int alextotal=0,leetotal=0;
        int startindex = 0,endindex=piles.length-1;
        while(startindex<endindex-1) {
        	if(whichpick(piles,startindex,endindex)==1) {
        		alextotal+=piles[endindex--];
        	} else alextotal+=piles[startindex++];
        	if(whichpick(piles,startindex,endindex)==0) {
        		leetotal+=piles[endindex--];
        	} else leetotal+=piles[startindex++];
        }
        alextotal+=Math.max(piles[startindex],piles[endindex]);
        leetotal+=Math.min(piles[startindex],piles[endindex]);
        if(alextotal>leetotal) return true;
        return false;
    }
    
    public int whichpick(int[] pile, int start, int end) {
    	// 0 = start
    	// 1 = end
    	if(pile[start]==pile[end]) return whichpick(pile,start+1,end-1);
    	if(pile[start]>pile[end]) return 0;
    	return 1;
    }
}
