package classes;

/*
 * 509 -
 * first submission at the bottom, no mistakes, beat 31%
 * second submission, just below, beat 100%!!
 */
public class Solution {
	public int fib(int N) {
		int[] thing = new int[31];
        thing[0]=0;
        thing[1]=1;
        for(int i=2;i<31;i++) {
    	    thing[i]=thing[i-1]+thing[i-2];
        }
        return thing[N];
    }
}

/*public int fib(int N) {
	if(N<2) return N;
    return fib(N-1) + fib(N-2);
}*/