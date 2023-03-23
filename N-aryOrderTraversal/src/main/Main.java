package main;

import classes.Node;
import classes.Solution;
import classes.Solution2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	/*
	 * 429
	 * difficulty - EASY
	 * 
	 */
	public static void main(String[] args) {
		Node lvl26 = new Node(6);
		Node lvl27 = new Node(7);
		List<Node> ch1 = new ArrayList<>();
		ch1.add(lvl26);
		ch1.add(lvl27);
		Node lvl28 = new Node(8);
		List<Node> ch2 = new ArrayList<>();
		ch2.add(lvl28);
		Node lvl29 = new Node(9);
		Node lvl210 = new Node(10);
		List<Node> ch3 = new ArrayList<>();
		ch3.add(lvl29);
		ch3.add(lvl210);
		Node lvl12 = new Node(2,null);
		Node lvl13 = new Node(3,ch1);
		Node lvl14 = new Node(4,ch2);
		Node lvl15 = new Node(5,ch3);
		List<Node> ch4 = new ArrayList<>();
		ch4.add(lvl12);
		ch4.add(lvl13);
		ch4.add(lvl14);
		ch4.add(lvl15);
		Node root = new Node(1,ch4);
		Solution2 sol = new Solution2();
		List<List<Integer>> answer = sol.levelOrder(root);
		int count = 0;
		Iterator<List<Integer>> levelLists = answer.iterator();
		while(levelLists.hasNext()) {
			List<Integer> levelList = levelLists.next();
			System.out.println("level : " + count++ + " list = " + levelList.toString());
		}
	}

}
