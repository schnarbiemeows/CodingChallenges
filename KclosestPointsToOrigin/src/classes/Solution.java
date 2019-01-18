package classes;

import java.util.Arrays;
import java.util.Comparator;

/*
 *	not a single mistake, first submission, no errors, beat 60.0% of submissions 
 */
public class Solution {

	public int[][] kClosest(int[][] points, int K) {
        int[][] stuff = new int[points.length][3];
        for(int i=0;i<points.length;i++) {
        	stuff[i][0]=points[i][0];
        	stuff[i][1]=points[i][1];
        	stuff[i][2]=points[i][0]*points[i][0]+points[i][1]*points[i][1];
        }
        Arrays.sort(stuff, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[2]>o2[2]) return 1;
				if(o1[2]<o2[2]) return -1;
				return 0;
			}
		});
		int[][] answer = new int[K][2];
		for(int j=0;j<K;j++) {
			answer[j][0]=stuff[j][0];
			answer[j][1]=stuff[j][1];
		}
		return answer;
    }
}
