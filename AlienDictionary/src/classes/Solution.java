package classes;

/*
 * 953
 * wow, beat 100%
 */
public class Solution {

	public boolean isAlienSorted(String[] words, String order) {
		if(words.length==1) return true;
        for(int i=0;i<words.length-1;i++) {
        	char[] first = words[i].toCharArray();
        	char[] next = words[i+1].toCharArray();
        	int smallersize = first.length<=next.length ? first.length : next.length;
        	int k=0;
			while(k<smallersize&&(order.indexOf(first[k])==order.indexOf(next[k]))) k++;
			if(k==smallersize&&smallersize==next.length) return false;
			if(k==smallersize&&smallersize==first.length) break;
			if(order.indexOf(first[k])>order.indexOf(next[k])) return false;
        }
        return true;
    }
}
