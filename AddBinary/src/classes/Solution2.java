package classes;

import java.util.Stack;

/**
 * this took WAYYYYYYYYYYYYYYYYYYYY to long to do...
 * the basic algorithm was correct, but..
 * what did I do wrong?
 * 1. I did not look at the constraints properly:
 *  1 <= a.length, b.length <= 104
 *  my first attempt was simply converting to binary int, adding, converting back,
 *  I should have known that this would create an error bc string was too large
 *  2. I did not realize that I was adding characters, and not the int values of those characters
 *      so, I needed to subtract 48 from each character first
 *
 * spped = 77.46%
 * memory = 89.94%
 *
 */
public class Solution2 {
    public String addBinary(String a, String b) {
        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=0; i<Math.min(achar.length,bchar.length);i++) {
            int sum = achar[achar.length-1-i]-48+bchar[bchar.length-1-i]-48+carry;
            if(sum==1 || sum==3) {
                sb.insert(0,"1");
            } else {
                sb.insert(0,"0");
            }
            carry=0;
            if(sum>1) {
                carry=1;
            }
        }
        if(achar.length>bchar.length) {
            for(int i= bchar.length; i<achar.length;i++) {
                int sum = achar[achar.length-1-i]-48+carry;
                if(sum==1 || sum==3) {
                    sb.insert(0,"1");
                } else {
                    sb.insert(0,"0");
                }
                carry=0;
                if(sum>1) {
                    carry=1;
                }
            }
        } else {
            for(int i=achar.length; i<bchar.length;i++) {
                int sum = bchar[bchar.length-1-i]-48+carry;
                if(sum==1 || sum==3) {
                    sb.insert(0,"1");
                } else {
                    sb.insert(0,"0");
                }
                carry=0;
                if(sum>1) {
                    carry=1;
                }
            }
        }
        if(carry>0) {
            sb.insert(0,"1");
        }
        return sb.toString();
    }
}
