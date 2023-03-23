package classes;

/*
 * start time = 1:58
 * end time = 2:03
 * total time = 5 minutes
 * speed = 96.7 %
 * memory = 44.2 %
 * notes:
 *
 */
public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(int i=0;i<operations.length;i++) {
            if(operations[i].charAt(1)=='-') {
                ans--;
            } else {
                ans++;
            }
        }
        return ans;
    }
}
