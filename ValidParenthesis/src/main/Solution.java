package main;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {

	// O(N) runtime
	// my solution beat 82.49% of the entries, FIRST submission, NO fails!!!!!
	public boolean isValid(String s) {
		Stack<String> stringStack = new Stack<String>();
		for(int i = 0; i<s.length(); i++) {
			String substr = s.substring(i, i+1);
			try {
				if(substr.equals("{")||substr.equals("[")||substr.equals("(")) {
					stringStack.push(substr);
				} else if(substr.equals("}")||substr.equals("]")||substr.equals(")")) {
					String temp = stringStack.pop();
					if(substr.equals("}")&&!temp.equals("{")||
							substr.equals("]")&&!temp.equals("[")||
							substr.equals(")")&&!temp.equals("("))
					{
						return false;
					}
				}
			} catch(EmptyStackException e) {
				return false;
			}
		}
		if(stringStack.isEmpty())
			return true;
		else
			return false;
	}
}
