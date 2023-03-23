package main;

import classes.Solution;

public class Main {

	/**
	 * 2469
	 * difficulty - easy
	 * description:
	 * You are given a non-negative floating point number rounded to two decimal places celsius,
	 * that denotes the temperature in Celsius.
	 *
	 * You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
	 *
	 * Return the array ans. Answers within 10^-5 of the actual answer will be accepted.
	 *
	 * Note that:
	 *
	 * Kelvin = Celsius + 273.15
	 * Fahrenheit = Celsius * 1.80 + 32.00
	 * constraints:
	 * 0 <= celsius <= 1000
	 */
	public static void main(String[] args) {
		double input = 36.50d;
		Solution sol = new Solution();
		double[] ans = sol.convertTemperature(input);
		System.out.println("K = " + ans[0] + " , F = " + ans[1] );
	}

}
