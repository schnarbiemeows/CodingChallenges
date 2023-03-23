package classes;

import java.util.*;

/**
 * for some reason, this is a lost faster and uses less space ?
 * speed = 69.17%
 * memory = 52.30%
 */
public class MyHashSet2 {
    public List<Integer>[] items = new LinkedList[10];

    public MyHashSet2() {

    }

    public void add(int key) {
        if(!contains(key)) {
            if(items[hashCode(key)]==null) {
                List<Integer> newList = new LinkedList<>();
                newList.add(key);
                items[hashCode(key)]=newList;
            } else {
                List<Integer> itemList = (LinkedList<Integer>) items[hashCode(key)];
                itemList.add(key);
            }
        }
        List<Integer> results = new ArrayList();
        results.stream().toArray(Integer[]::new);
    }

    public void remove(int key) {
        if(contains(key)) {
            List<Integer> itemList = (LinkedList<Integer>) items[hashCode(key)];
            itemList.remove(new Integer(key));
            if(itemList.isEmpty()) {
                items[hashCode(key)]=null;
            }
        }
    }

    public boolean contains(int key) {
        if(items[hashCode(key)]==null) return false;
        else {
            List<Integer> itemList = (LinkedList<Integer>) items[hashCode(key)];
            if(itemList.contains(key)) return true;
            return false;
        }
    }

    private int hashCode(int key) {
        return key%5;
    }
}
