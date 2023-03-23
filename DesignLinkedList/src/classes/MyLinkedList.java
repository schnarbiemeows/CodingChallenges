package classes;

/*
 * start time = NA
 * end time = NA
 * total submissions = 9!
 * speed =  5.64%
 * memory =  17.6%
 * notes:
 * you REALLY need to look at the description closely
 * biggest mistake was that you did not include null checks for every node,
 * you needed to check every node for null
 * you also did not see the "if valid else return -1" for the get calls
 */
public class MyLinkedList {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public void add(int val) {
            if(this.next==null) {
                Node item = new Node(val);
                this.next = item;
            } else {
                this.next.add(val);
            }
        }

        public void add(int index, int val) {
            if(index==0) {
                if(this.next != null ) {
                    Node item = new Node(val);
                    item.next = this.next;
                    this.next = item;
                } else {
                    add(val);
                }
            } else {
                if(this.next!=null) {
                    this.next.add(index-1,val);
                }
            }
        }

        public void deleteAtIndex(int index) {
            if(index==1) {
                if(this.next != null ) {
                    if(this.next.next!=null) {
                        this.next = this.next.next;
                    } else {
                        this.next = null;
                    }
                }
            } else {
                if(this.next!=null) {
                    this.next.deleteAtIndex(index-1);
                }

            }
        }

        public int get(int index) {
            if(index==0) {
                return this.val;
            } else {
                if(this.next!=null) {
                    return this.next.get(index-1);
                } else {
                    return -1;
                }

            }
        }
    }

    Node root;

    public MyLinkedList() {
        this.root = null;
    }

    public int get(int index) {
        if(index==0) {
            return this.root.val;
        } else {
            if(this.root.next!=null) {
                return this.root.next.get(index-1);
            } else {
                return -1;
            }
        }
    }

    public void addAtHead(int val) {
        Node item = new Node(val);
        if(this.root==null) {
            this.root = item;
        } else {
            item.next=this.root;
            this.root = item;
        }
    }

    public void addAtTail(int val) {
        if(this.root==null) {
            this.root = new Node(val);
        } else if(this.root.next==null) {
            Node item = new Node(val);
            this.root.next = item;
        } else {
            this.root.next.add(val);
        }
    }

    public void addAtIndex(int index, int val) {
        if(index==0) {
            addAtHead(val) ;
        } else {
            if(this.root!=null) {
                this.root.add(index-1,val);
            }
        }
    }

    public void deleteAtIndex(int index) {
        if(this.root!=null) {
            if(index==0) {
                this.root = this.root.next;
            } else if(index==1) {
                if(this.root.next != null && this.root.next.next != null) {
                    this.root.next = this.root.next.next;
                } else {
                    this.root.next = null;
                }
            } else {
                if(this.root.next!=null) {
                    this.root.next.deleteAtIndex(index-1);
                }
            }
        }

    }
}
