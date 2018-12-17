package classes;

import java.util.Stack;

public class Solution {

	public int calPoints(String[] ops) {

		Stack<String> storage = new Stack<String>();
		int sum = 0;
		String temp1="", temp2="";
		for(int i=0;i<ops.length;i++) {
			String operation = ops[i];
			if(operation.equals("C")) {								// cancel the last valid round's points
				// pull the last valid round's points off the stack
				int value = Integer.parseInt(storage.pop());
				// subtract from the sum
				sum-=value;
			} else if(operation.equals("D")) {						// give yourself double the last valid round's points
				// peek at the last value on the stack, but don't remove
				int value = Integer.parseInt(storage.peek());
				// add double that value to the sum
				sum+=2*value;
				// push this round's points to the stack
				String valueStr=new Integer(2*value).toString();
				storage.push(valueStr);
			} else if(operation.equals("+")) {					// give yourself the last two round's points again
				// pop off the last two round's points
				temp1 = storage.pop();
				temp2 = storage.pop();
				// convert to int
				int int1 = Integer.parseInt(temp1); 
				int int2 = Integer.parseInt(temp2); 
				// add to the sum
				sum+=int1+int2;
				// make a String out of this round's points
				int subtotal = int1+int2;
				String subtotalStr = new Integer(subtotal).toString();
				// replace the previous round's points back onto the stack
				storage.push(temp2);
				storage.push(temp1);
				// and then push this new round's points to the stack
				storage.push(subtotalStr);
			} else { 											// if it is a number
				// convert to int
				int value = Integer.parseInt(operation);
				// add to the sum
				sum+=value;
				// push the number to the Stack
				storage.push(operation);
			}
		}
		return sum;
	}
}
