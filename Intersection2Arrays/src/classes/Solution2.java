package classes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 349
 * much better speed, tho I hit an indexOutOfBounds on first submission
 * don't understand how this uses more memory than the first answer(?)
 * Runtime: 2 ms, faster than 98.71% of Java online submissions for Intersection of Two Arrays.
 * Memory Usage: 37.5 MB, less than 37.55% of Java online submissions for Intersection of Two Arrays.
 */
public class Solution2 {

	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1==null||nums2==null) return new int[]{};
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> resultlist = new HashSet<Integer>();
		int nums2counter = 0;
		for(int i=0;i<nums1.length;i++) {
			while(nums2counter<nums2.length&&nums2[nums2counter]<nums1[i]) nums2counter++;
			if(nums2counter<nums2.length&&nums2[nums2counter]==nums1[i]) resultlist.add(nums1[i]);
		}
		int[] returnarray = new int[resultlist.size()];
        int index=0;
        Iterator iter = resultlist.iterator();
        while(iter.hasNext()) {
        	returnarray[index++] = (int) iter.next();
        }
          return returnarray;
    }
}
