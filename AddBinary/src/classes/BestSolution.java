package classes;

/**
 * not my code, this solution beats 100% time-wise
 * I mostly did what this guy did, including the carry variable, and the final line 21,
 * and the StringBuilder. I coulda reversed, but I thought it would be O(nlogn)
 */
public class BestSolution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() -1 ;
        int j = b.length() -1 ;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum+= a.charAt(i--) - '0';
            if(j>=0) sum+= b.charAt(j--) - '0';
            carry = sum >1 ? 1:0;
            result.append(sum%2);
        }
        if(carry!=0) result.append(carry);
        return result.reverse().toString();
    }
}
