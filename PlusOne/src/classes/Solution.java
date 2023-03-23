package classes;

/*
 * 3:47 - 4:07
 * speed = 29.21%
 * memory = 23.7%
 *
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        for(int i = digits.length-1; i>=0;i--) {
            if(i==digits.length-1) {
                if(digits[digits.length-1]==9) {
                    carry = true;
                }
                digits[i]=(digits[i]+1)%10;
            } else {
                if(carry) {
                    carry=false;
                    if((digits[i]+1)/10>0) {
                        carry=true;
                    }
                    digits[i]=(digits[i]+1)%10;
                }
            }

        }
        if(digits[0]==0) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0]=1;
            for(int i=0;i<digits.length;i++) {
                newDigits[i+1]=digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}
