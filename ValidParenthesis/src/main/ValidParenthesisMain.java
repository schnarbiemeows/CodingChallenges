package main;

public class ValidParenthesisMain {

	/*
	 * Difficulty - EASY
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	 * determine if the input string is valid.
		An input string is valid if:
		Open brackets must be closed by the same type of brackets.
		Open brackets must be closed in the correct order.
		Note that an empty string is also considered valid.
		
		first submission accepted! no fails!
	*/
	public static void main(String[] args) {
		Solution2 mySolution = new Solution2();
		String s1 = "(([]){})";
		System.out.println("should be true : " + mySolution.isValid(s1));
		s1 = "()";
		System.out.println("should be true : " + mySolution.isValid(s1));
		s1 = "(){}[]";
		System.out.println("should be true : " + mySolution.isValid(s1));
		s1 = "([";
		System.out.println("should be false : " + mySolution.isValid(s1));
		s1 = "([)]";
		System.out.println("should be false : " + mySolution.isValid(s1));
		s1 = "{[]}";
		System.out.println("should be true : " + mySolution.isValid(s1));
	}
}
