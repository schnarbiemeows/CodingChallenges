package classes;

/*
 * start time = 10:30
 * end time =
 * total time =  minutes
 * speed =  %
 * memory =  %
 * notes:
 * they are common if either
 */
public class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int num111 = Integer.parseInt(event1[0].replace(":",""));
        int num121 = Integer.parseInt(event1[1].replace(":",""));
        int num211 = Integer.parseInt(event2[0].replace(":",""));
        int num221 = Integer.parseInt(event2[1].replace(":",""));
        return !(num211>num121||num221<num111);
    }
}
