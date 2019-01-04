package main;

import classes.RecentCounter3;

public class NumRecentCallsMain {

	/*
	 * difficulty - EASY
	 * Write a class RecentCounter to count recent requests.
	 * It has only one method: ping(int t), where t represents some time in milliseconds.
	 * Return the number of pings that have been made from 3000 milliseconds ago until now.
	 * Any ping with time in [t - 3000, t] will count, including the current ping.
	 * It is guaranteed that every call to ping uses a strictly larger value of t than before.
	 */
	public static void main(String[] args) {
		RecentCounter3 obj = new RecentCounter3();
		int param_1 = obj.ping(1);
		int param_2 = obj.ping(100);
		int param_3 = obj.ping(3001);
		int param_4 = obj.ping(3002);
		System.out.println(param_1+" "+param_2+" "+param_3+" "+param_4);
	}

}
