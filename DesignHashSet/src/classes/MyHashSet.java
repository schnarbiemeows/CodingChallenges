package classes;

/*
 * start time = 9:57
 * end time = 10:17
 * total time = 20 minutes
 * speed = 27.63 %
 * memory = 5.27 %
 * notes:
 *
 */
public class MyHashSet {

    public int[] items = new int[1000000];

    public MyHashSet() {

    }

    public void add(int key) {
        items[key]=1;
    }

    public void remove(int key) {
        items[key]=0;
    }

    public boolean contains(int key) {
        return items[key]==1;
    }
}
