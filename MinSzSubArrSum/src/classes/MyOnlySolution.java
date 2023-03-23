package classes;

/**
 * I'm redoing this here so that I understand it
 * imagine two pointers that define the endpoints of an inchworm
 * that inches across the array of numbers in O(n) time
 * it starts at the beginning, the front of the inchworm inches across the array, adding up the numbers
 * until their sum >= target
 * then, the back of the inchworm inches up , subtracting the array values back out until the total goes back
 * under the value target. and each time the back of the worm inches up, the length of the worm(i-j+1) is compared to
 * the current value for the minlength, taking the minimum each time.
 * then , once the worm reaches the end of the array, minlength is returned
 *
 * speed = 35.33%
 * memory = 50.61%
 */
public class MyOnlySolution {
    public int minSubArrayLen(int target, int[] nums) {
        int frontOfWorm = 0;
        int backOfWorm = 0;
        int minlength = Integer.MAX_VALUE;
        int size = nums.length;
        int sum=0;
        for(frontOfWorm=0;frontOfWorm<size;frontOfWorm++) {
            sum+=nums[frontOfWorm];
            while(sum>=target) {
                minlength=Math.min(minlength,(frontOfWorm-backOfWorm+1));
                sum-=nums[backOfWorm];
                backOfWorm++;
            }
        }
        return minlength==Integer.MAX_VALUE ? 0 : minlength;
    }
}
