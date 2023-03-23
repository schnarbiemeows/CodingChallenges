package classes;

/**
 * brute force, took me 1 minute to write
 * speed = 53.11%
 * memory = 73.2%
 * but I know there is a better way to do in-place
 */
public class Solution2 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];
        for(int i=0;i<length;i++) {
            temp[(i+k)%length]=nums[i];
        }
        for(int j=0;j<length;j++) {
            nums[j]=temp[j];
        }
        for(int j=0;j<length;j++) {
            System.out.print(nums[j]+",");
        }
    }
}
