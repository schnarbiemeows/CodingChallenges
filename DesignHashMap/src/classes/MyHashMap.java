package classes;

/*
 * 706
 * hmm, relatively easy, only took me about 5 minutes to code this, first submission beat 65.27%
 * no memory rating available
 * not sure how it could be any faster
 */
public class MyHashMap {

	int[] map = new int[1000001];
	/** Initialize your data structure here. */
    public MyHashMap() {
        for(int i=0;i<map.length;i++) {
        	map[i]=-1;
        }
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        map[key]=value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return map[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        map[key]=-1;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */