package classes;

import java.util.HashSet;
import java.util.Set;

/**
 * 100% speed
 * memory = 38.38% ???
 * I googled "armstrong numbers", and used the results, I do not know if that would be considered cheating
 * or not, I did not copy code
 */
public class Solution2 {
    public boolean isArmstrong(int n) {
        if(n<10) return true;
        int[] sn = {153, 370, 371, 407,
                1634, 8208, 9474,
                54748, 92727, 93084,
                548834,
                1741725, 4210818, 9800817, 9926315,
                24678050, 24678051, 88593477,
                146511208, 472335975, 534494836, 912985153};
        for(int i=0;i<sn.length;i++) {
            if(sn[i]==n) return true;
        }
        return false;
    }
}
