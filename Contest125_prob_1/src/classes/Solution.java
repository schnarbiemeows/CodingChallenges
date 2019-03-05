package classes;

/*
 * 3 wrong answers but because of petty details, which adding the first 2 lines solvd
 */
public class Solution {

	public int findJudge(int N, int[][] trust) {
		if(N==1) return N;
        if(trust.length<1) return -1;
        int[][] trusts = new int[N][N];
        for(int i=0;i<trust.length;i++) {
        	trusts[trust[i][0]-1][0]++;
        	trusts[trust[i][1]-1][1]++;
        }
        int zerocount = 0;
        for(int j=0;j<trusts.length;j++) {
        	if(trusts[j][0]>0) zerocount++;
        }
        if(zerocount+1!=N) return -1;
        for(int j=0;j<trusts.length;j++) {
        	if(trusts[j][1]==N-1) return j+1;
        }
        return -1;
    }
}
