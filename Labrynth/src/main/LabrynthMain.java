package main;

import classes.LabrynthSolution3;

/**
 * this was a test problem that I was given as part of a pre-interview test
 * it should have taken 90 minutes to do
 * it took me 5 hours!
 */
public class LabrynthMain {

	/**
	 * the algorithm:
	 * this is a search algorithm problem
	 * - search all of the possible paths until you either reach the endpoint, or you run out of paths
	 * - we don't want to backtrack, so we need some way of keeping track of all of the points that we have already been to
	 * - we also need to figure out the starting point
	 * - for each step in a path, if there is something already in it, or if it can be seen by a sentry, it is a dead end
	 *
	 */
	public static void main(String[] args) {
		String[] input = {  "X.....>",
							"..<....",
							".>..X..",
							"A...X.."};
		//String[] input = {"A.v", "..."};
		LabrynthSolution3 sol = new LabrynthSolution3();
		System.out.println(sol.solution(input));
	}

}
