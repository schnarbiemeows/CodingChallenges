package classes;

/**
 * this is not my code
 * this is what I could not come up with in Solution, an in-place
 * solution
 */
public class InPlaceSolution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return;
        }
        //k = k % nums.length;
        int count = 0;
        for(int i = 0; i < k; ++i){
            count += rotate(nums, i, k);
            if(count == nums.length){
                break;
            }
        }
    }

    private int rotate(int[] nums, int start, int k){
        int i = start;
        int pre = nums[start];
        int count = 1;
        while((i = (i + k) % nums.length) != start){
            ++count;
            int temp = nums[i];
            nums[i] = pre;
            pre = temp;
        }
        nums[start] = pre;
        return count;
    }
}
