package classes;

import java.util.HashSet;
import java.util.Set;

/*
 * start time = 3:06
 * end time = 3:21
 * total time = 15 minutes
 * speed =  98.19%
 * memory =  95.89%
 * notes:
 * great!
 */
public class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
            Set<Integer> values = new HashSet();
            int temp = n;
            while(true) {
                int answer = 0;
                while(temp>0) {
                    answer+=(temp%10)*(temp%10);
                    temp=temp/10;
                }
                if(answer==1) return true;
                if(values.contains(answer)) return false;
                values.add(answer);
                temp=answer;
        }
    }
}
