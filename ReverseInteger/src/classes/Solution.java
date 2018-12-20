package classes;

import java.util.Stack;

public class Solution {

	/* this solution sucks
     * it only beat 5.33% of solutions
     */
     public int reverse(int x) {

                  boolean isNeg = false;
                  int startIndex = 0;
                  String intStr1 = x+"";
                  if(intStr1.contains("-")) isNeg=true;
                  if(isNeg) startIndex=1;
                  Stack<String> myStack = new Stack<String>();
                  for(int i=startIndex;i<intStr1.length();i++) {
                         myStack.push(intStr1.substring(i, i+1));
                  }
                  StringBuilder reverseStr = new StringBuilder("");
                  while(!myStack.isEmpty()) {
                         reverseStr.append(myStack.pop());
                  }
                  Long reverseInteger = new Long(reverseStr.toString());
                  if(reverseInteger.intValue()!=reverseInteger.longValue()) return 0;
                  else if(isNeg) return 0-reverseInteger.intValue();
                  else return reverseInteger.intValue();
     }
}
