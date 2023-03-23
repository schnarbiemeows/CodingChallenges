package classes;

/*
 * start time = 9:49
 * end time = 10:29
 * total time = 40 minutes
 * speed = 100%!!!!
 * memory = 79.73 %
 * notes:
 * got the problem description wrong the first time, but I caught it in testing
 *
 */
public class Solution {
    public int minimumSum(int num) {
        int temp = num;
        int[] newnums = new int[10];
        newnums[temp%10]++;
        temp /=10;
        newnums[temp%10]++;
        temp /=10;
        newnums[temp%10]++;
        temp /=10;
        newnums[temp%10]++;
        int sum = 0;
        int count = 0;
        for(int i=0;i<newnums.length;i++) {
            while(newnums[i]>0) {
                if(count<2) {
                    sum+=10*i;
                    newnums[i]--;
                    count++;
                } else {
                    sum+=i;
                    newnums[i]--;
                }
            }
        }
        System.out.println("num = " + num + " sum = " + sum);
        return sum;
    }
}
