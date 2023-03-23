package main;

import classes.Solution;

public class Main {

	/*
		1108
	 * difficulty - easy
	 * description:
	 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
	 	A defanged IP address replaces every period "." with "[.]".
	 * constraints:
	 * The given address is a valid IPv4 address.
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String addr = "1.1.1.1";
		System.out.println(sol.defangIPaddr(addr));
		addr = "255.100.50.0";
		System.out.println(sol.defangIPaddr(addr));

	}

}
