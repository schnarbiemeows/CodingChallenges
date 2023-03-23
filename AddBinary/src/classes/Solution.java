package classes;

import java.util.Map;

/*
 * 8:19 - .... ~ 10:25 (I took breaks, but at least an hour to do)
 * did not finish, solution is in Solution 2
 * Speed =
 * memory =
 * 
 */
public class Solution {
    public String addBinary(String a, String b) {
        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();
        int diff = achar.length-bchar.length;
        int[] temp = new int[Math.max(achar.length, bchar.length)];
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = achar.length;i>0;i--) {
            temp[achar.length-i] = achar[i-1];
        }
        int index = 0;
        for(int j = bchar.length-1;j>=0;j--) {
            int sum = carry+temp[index]+bchar[j];
            if(sum==1 || sum==3) {
                sb.insert(0,"1");
            } else {
                sb.insert(0,"0");
            }
            carry=0;
            if(sum>1) {
                carry=1;
            }
            index++;
        }
        if(achar.length> bchar.length) {
            for(int i = bchar.length; i<achar.length;i++) {
                int sum = carry+temp[i];
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
