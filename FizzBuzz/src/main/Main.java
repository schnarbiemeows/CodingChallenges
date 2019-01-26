package main;

import java.util.List;

import classes.Solution;

public class Main {

	/*
	 * 412
	 * difficulty - EASY
	 * Write a program that outputs the string representation of numbers from 1 to n.
	 * But for multiples of three it should output “Fizz” instead of the number and for the multiples 
	 * of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
	 */
	public static void main(String[] args) {
		int n=15;
		Solution sol = new Solution();
		List<String> answer = sol.fizzBuzz(n);
		System.out.print("[");
		for(int j=0;j<answer.size();j++) {
			System.out.print(answer.get(j)+", ");
        }
	}

}
