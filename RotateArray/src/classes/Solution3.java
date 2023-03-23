package classes;

/**
 * this still uses another array, but it is a bit more efficient?
 * {1,2,3,4,5,6,7}, k=3
 * speed = 90.45%
 * memory = 91.67%
 * great!
 */
public class Solution3 {
    public void rotate(int[] nums, int k) {
        if(k==0) return;
        int length = nums.length;
        int newlen = k%length;
        int[] temp = new int[newlen];
        for(int i=length-newlen;i<length;i++) {
            temp[i-(length-newlen)]=nums[i];          // copy all of the items after newlen to another array
        }
        for(int j=length-newlen-1;j>=0;j--) {
            nums[j+newlen]=nums[j];
        }
        for(int z=0;z<newlen;z++) {
            nums[z]=temp[z];
        }
        for(int j=0;j<length;j++) {
            System.out.print(nums[j]+",");
        }
    }
}
