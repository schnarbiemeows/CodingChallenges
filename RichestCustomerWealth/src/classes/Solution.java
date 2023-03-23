package classes;

/**
 * 
 * 8:30 - 8:41
 * so
 * row = customer
 * column = bank
 * so all we gotta do is add up the values across
 * so lets first add up the values across so that the last column always contains the total for the entire row
 * then we'll just go down the rows, comparing the last column for each row, the column with the greatest value wins
 *
 * submission only beat 10.69% speed
 * beat 69.56% memory
 */
public class Solution {

    public int maximumWealth(int[][] accounts) {
        if(accounts==null||accounts.length==0||accounts[0].length==0) return 0;
        int cols = accounts.length;
        int rows = accounts[0].length;
        int answer = 0;
        for(int j = 0;j<cols;j++) {
            for(int i=1;i<rows;i++) {
                accounts[j][i] += accounts[j][i-1];
            }
        }
        answer = accounts[0][rows-1];
        for(int k=1;k<cols;k++) {
            if (accounts[k][rows-1]>answer) {
                answer = accounts[k][rows-1];
            }
        }
        return answer;
    }
}
