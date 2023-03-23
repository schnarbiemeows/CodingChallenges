package classes;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * speed = 59.56%
 * memory = 49.67%
 * really don't know how it is that these object implementations are faster than the array implementattions, but...
 */
public class MyRealHashMap {

    class KeyValuePair {
        int key;
        int value;
        public KeyValuePair() {

        }

        public KeyValuePair(int key, int value) {
            this.key=key;
            this.value = value;
        }
    }
    public List<KeyValuePair>[] buckets = new LinkedList[1000];

    public MyRealHashMap() {

    }

    public void put(int key, int value) {
        if(!contains(key)) {
            if(buckets[hashCode(key)]==null) {
                List<KeyValuePair> newList = new LinkedList<>();
                newList.add(new KeyValuePair(key,value));
                buckets[hashCode(key)]=newList;
            } else {
                List<KeyValuePair> itemList = (LinkedList<KeyValuePair>) buckets[hashCode(key)];
                itemList.add(new KeyValuePair(key,value));
            }
        } else {
            List<KeyValuePair> itemList = (LinkedList<KeyValuePair>) buckets[hashCode(key)];
            for(KeyValuePair item: itemList) {
                if(item.key==key) {
                    item.value=value;
                }
            }
        }
    }

    public int get(int key) {
        if(contains(key)) {
            List<KeyValuePair> itemList = (LinkedList<KeyValuePair>) buckets[hashCode(key)];
            for(KeyValuePair item: itemList) {
                if(item.key==key) {
                    return item.value;
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        if(contains(key)) {
            List<KeyValuePair> itemList = (LinkedList<KeyValuePair>) buckets[hashCode(key)];
            ListIterator<KeyValuePair> itemListItr = itemList.listIterator();
            while(itemListItr.hasNext()) {
                KeyValuePair item = itemListItr.next();
                if(item.key==key) itemListItr.remove();
            }
            if(itemList.isEmpty()) {
                buckets[hashCode(key)]=null;
            }
        }
    }

    public boolean contains(int key) {
        if(buckets[hashCode(key)]==null) return false;
        else {
            List<KeyValuePair> itemList = (LinkedList<KeyValuePair>) buckets[hashCode(key)];
            for(KeyValuePair item: itemList) {
                if(item.key==key) {
                    return true;
                }
            }
            return false;
        }
    }

    private int hashCode(int key) {
        return key%777;
    }
}
