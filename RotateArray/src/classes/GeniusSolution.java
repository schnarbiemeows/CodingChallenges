package classes;

/**
 * this is not my code
 * in-place solution
 * no idea how he figured out that this gives you the answer, but its genius
 *
 * say we rotate array a = [1,2,3,4,5,6,7] by 3 steps
 * first reverse the array: a = [7,6,5,4,3,2,1]
 * then reverse the first part ( at index 0 to k-1(in this case 2) ) a = [5,6,7, ... ]
 * finally reverse the rest (at index k to the last) a = [..., 1,2,3,4]
 */
public class GeniusSolution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        nums = rotate(nums, 0, nums.length-1);
        nums = rotate(nums, 0, k-1);
        nums = rotate(nums, k, nums.length-1);
    }
    private int[] rotate(int[] nums, int head, int tail){
        int i = head, j = tail;
        int temp;
        while( i <= j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
