package classes;

/**
 * recursive
 * speed = 29.21%
 * memory = 60.86%
 * exact same speed, better on memory
 */
public class Solution2 {
    public int[] plusOne(int[] digits) {
        int remainder = run(digits,0);
        if(remainder==1) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0]=1;
            for(int i=0;i<digits.length;i++) {
                newDigits[i+1]=digits[i];
            }
            return newDigits;
        }
        return digits;
    }
    private int run(int[] digits,int index) {
        if(index==digits.length-1) {
            int temp=digits[digits.length-1]+1;
            digits[index]=temp%10;
            return temp/10;
        } else {
            int temp=digits[index]+run(digits,index+1);
            digits[index]=temp%10;
            return temp/10;
        }
    }
    /**
     * the results for 0 = [0] + add from [1]
     *                          = [1] + add from [2]
     *                                  = [2] + results for [3]
     */
}
