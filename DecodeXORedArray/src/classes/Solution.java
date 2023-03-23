package classes;

/*
 * start time = 3:40
 * end time = ??? (I went to the brooklyn bridge)
 * total time =  minutes
 * speed =  33.69%
 * memory =  13.67%
 * notes:
 * pfft, I see other solutions exactly like mine that beat 100%
 */
public class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        for(int i=0;i< encoded.length;i++) {
            ans[i+1] = encoded[i]^ans[i];
        }
        return ans;
    }
}
