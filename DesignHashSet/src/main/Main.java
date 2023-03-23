package main;

import classes.MyHashSet2;
import classes.Solution;

public class Main {

	/**
	 * 705
	 * difficulty - easy
	 * description:
	 * Design a HashSet without using any built-in hash table libraries.
	 *
	 * Implement MyHashSet class:
	 *
	 * void add(key) Inserts the value key into the HashSet.
	 * bool contains(key) Returns whether the value key exists in the HashSet or not.
	 * void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
	 * constraints:
	 * 0 <= key <= 10^6 // so an array of 10000 items should do it,
	 * At most 10^4 calls will be made to add, remove, and contains.
	 */
	public static void main(String[] args) {
		MyHashSet2 myHash = new MyHashSet2();
		myHash.add(1);
		myHash.add(2);
		System.out.println(myHash.contains(1));
		System.out.println(myHash.contains(3));
		myHash.add(2);
		System.out.println(myHash.contains(2));
		//myHash.remove(1);
		myHash.remove(2);
		System.out.println(myHash.contains(2));


	}

}
