package main;

import classes.MyHashMap;
import classes.MyRealHashMap;
import classes.Solution;

public class Main {

	/*
	 * 706
	 * difficulty - EASY
	 * Design a HashMap without using any built-in hash table libraries.
	 * To be specific, your design should include these functions:
	 * put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
	 * get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
	 * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
	 */
	public static void main(String[] args) {
		
		MyRealHashMap obj = new MyRealHashMap();
		obj.put(2,1);
		obj.put(2,2);
		int param_2 = obj.get(2);
	}

}
