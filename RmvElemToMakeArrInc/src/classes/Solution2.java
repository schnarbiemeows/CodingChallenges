package classes;

/**
 * damn, even worse
 * speed = 7.95%
 * memory = 27.95%
 */
public class Solution2 {
    public boolean canBeIncreasing(int[] nums) {
        boolean possible = true;
        int[] newints = new int[nums.length-1];
        for(int i=0;i<nums.length;i++) {
            int counter = 0;
            for(int j=0;j<nums.length;j++) {
               if(j!=i) {
                   newints[counter++]=nums[j];
               }
            }
            for(int k=1;k< newints.length;k++) {
                if(newints[k]<=newints[k-1]) possible = false;
            }
            if(possible) return true;
            possible=true;
        }
        return false;
    }
}
