package classes;

/*
 * 706
 * trying something to see if it is faster
 * hmm, no, it actually runs slower, <shrug> this may be a case of time of day
 */
public class MyHashMap2 {

	int[] map = new int[1000001];
	int[] trymap = new int[1000001];
	/** Initialize your data structure here. */
    public MyHashMap2() {
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        map[key]=value;
        trymap[key]++;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(map[key]==0&&trymap[key]==0) return -1;
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