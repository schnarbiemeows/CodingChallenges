package classes;

/*
 * start time = 4:59
 * end time = 5:05
 * total time = 6 minutes
 * speed = 100% %
 * memory = 76.54 %
 * notes:
 * had to think about it for a second
 */
public class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        return n*2;
    }
}
