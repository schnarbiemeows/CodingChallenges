package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparingMain {

	static class Item {
		private int value;
		private int position;
		
		public Item(int value, int position) {
			super();
			this.value = value;
			this.position = position;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public int getPosition() {
			return position;
		}
		public void setPosition(int position) {
			this.position = position;
		}
	}
	
	public static void main(String[] args) {
		
		int[] myArray = {11,5,5,2};
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i] + ", ");
		}
		System.out.println();
		for(int i=0;i<myArray.length;i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		Item[] trans = new Item[myArray.length];
		for(int i=0;i<myArray.length;i++) {
			Item temp = new Item(myArray[i], i);
			trans[i] = temp;
		}
		Comparator<Item> itemComparator = new Comparator<Item>() {
			public int compare(Item o1, Item o2) {
				int diff = o1.getValue()-o2.getValue();
				if(diff==0) return 0;
				if(diff >0) return 1;
				return -1;
			}
		};
		Arrays.sort(trans, itemComparator);
		for(int i=0;i<trans.length;i++) {
			System.out.print(trans[i].getValue() + ", ");
		}
		System.out.println();
		for(int i=0;i<trans.length;i++) {
			System.out.print(trans[i].getPosition() + ", ");
		}
		System.out.println();
	}

}


