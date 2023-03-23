package main;

import classes.Solution;

/**
 * https://leetcode.com/contest/weekly-contest-316/
 */
public class Main {

	/**
	 * 6214
	 * difficulty - EASY
	 * description:
	 * You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:
	 * event1 = [startTime1, endTime1] and
	 * event2 = [startTime2, endTime2].
	 * Event times are valid 24 hours format in the form of HH:MM.
	 * A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).
	 * Return true if there is a conflict between two events. Otherwise, return false.
	 *
	 * constraints:
	 * evnet1.length == event2.length == 2.
	 * event1[i].length == event2[i].length == 5
	 * startTime1 <= endTime1
	 * startTime2 <= endTime2
	 * All the event times follow the HH:MM format.
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] event1 = new String[]{"01:00","05:00"};
		String[] event2 = new String[]{"01:59","03:00"};
		System.out.println(sol.haveConflict(event1,event2));
	}

}
