package main;

import classes.Solution;

public class Main {

	/**
	 * 1656
	 * difficulty - EASY
	 * description:
	 * There is a stream of n (idKey, value) pairs arriving in an arbitrary order, where idKey is an integer between
	 * 1 and n and value is a string. No two pairs have the same id.
	 *
	 * Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values
	 * after each insertion. The concatenation of all the chunks should result in a list of the sorted values.
	 *
	 * Implement the OrderedStream class:
	 *
	 * OrderedStream(int n) Constructs the stream to take n values.
	 * String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream, then returns the
	 * largest possible chunk of currently inserted values that appear next in the order.
	 *
	 * constraints:
	 *	1 <= n <= 1000
	 * 1 <= id <= n
	 * value.length == 5
	 * value consists only of lowercase letters.
	 * Each call to insert will have a unique id.
	 * Exactly n calls will be made to insert.
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
	}

}
