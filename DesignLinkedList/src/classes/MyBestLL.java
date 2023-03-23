package classes;

/**
 * christ o mighty, still took me forever to do this, even after I saw the "BestLinkedList" answer
 * and still 2 wrong submissions
 * speed = 61.95%
 * memory = 82.64%
 */
public class MyBestLL {

    int[] vals = new int[1];
    int capacity = 1;
    int arrIndex = 0;

    public MyBestLL() {

    }

    public int get(int index) {
        if(index<arrIndex) {
            return vals[index];
        } else {
            return -1;
        }
    }

    public void addAtHead(int val) {
        if(arrIndex==capacity) {
            increaseCapacity();
        }
        for(int i=arrIndex;i>0;i--) {
            vals[i] = vals[i-1];
        }
        vals[0]=val;
        arrIndex++;
    }

    public void addAtTail(int val) {
        if(arrIndex==capacity) {
            increaseCapacity();
        }
        vals[arrIndex]=val;
        arrIndex++;
    }

    public void addAtIndex(int index, int val) {
        if(index==0) {
            addAtHead(val);
        } else if(index==arrIndex) {
            addAtTail(val);
        } else {
            if(index>arrIndex) return;
            if(arrIndex==capacity) {
                increaseCapacity();
            }
            for(int i=arrIndex;i>index;i--) {
                vals[i]=vals[i-1];
            }
            vals[index]=val;
            arrIndex++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index<arrIndex) {
            for(int i=index;i<arrIndex-1;i++) {
                vals[i]=vals[i+1];
            }
            arrIndex--;
        }
    }

    private void increaseCapacity() {
        int[] temp = new int[2*capacity];
        // copy from source starting at 0, to destination, starting at 0, these many elements
        System.arraycopy(vals,0,temp,0,vals.length);
        vals=temp;
        capacity*=2;
    }
}
