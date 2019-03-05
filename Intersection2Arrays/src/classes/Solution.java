package classes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 349
 * Runtime: 4 ms, faster than 42.00% of Java online submissions for Intersection of Two Arrays.
 * Memory Usage: 35.2 MB, less than 67.54% of Java online submissions for Intersection of Two Arrays.
 */
public class Solution {

	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1==null||nums2==null) return new int[]{};
		Set<Integer> resultset = new TreeSet<Integer>();
        Set<Integer> resultset2 = new TreeSet<Integer>();
        for(int i=0;i<nums1.length;i++) {
        	resultset.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++) {
        	if(resultset.contains(nums2[j])) resultset2.add(nums2[j]);
        }
        int[] returnarray = new int[resultset2.size()];
        int index=0;
        Iterator iter = resultset2.iterator();
        while(iter.hasNext()) {
        	returnarray[index++] = (int) iter.next();
        }
          return returnarray;
    }
}
