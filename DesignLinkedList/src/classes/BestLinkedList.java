package classes;

/**'NOT MY CODE
 * this solution beats 99.34% speed and 100% memory!
 * does not use an inner class
 */
public class BestLinkedList {
    int[] ar;
    int tIdx;

    public BestLinkedList() {
        ar = new int[10];
        tIdx = 0;
    }

    public int get(int index) {
        if(index>=tIdx) return -1;
        return ar[index];
    }

    public void addAtHead(int val) {
        if(tIdx==ar.length-1)increaseArraySize();
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(tIdx,val);
    }

    public void addAtIndex(int index, int val) {
        if(index>tIdx || index<0)return;
        if(tIdx==ar.length-1)increaseArraySize();
        int pos = ar[index];
        for(int i = tIdx;i>index;i--)ar[i] = ar[i-1];
        ar[index]=val;
        tIdx++;
    }


    public void deleteAtIndex(int index) {
        if(index>=tIdx || index<0)return;
        for(int i = index;i<tIdx;i++)ar[i] = ar[i+1];
        tIdx--;
    }

    private void increaseArraySize(){
        int[] tmp = new int[ar.length*2];
        System.arraycopy(ar, 0, tmp, 0, ar.length);
        ar = tmp;
    }
}
