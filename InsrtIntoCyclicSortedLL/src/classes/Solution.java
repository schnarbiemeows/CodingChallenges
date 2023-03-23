package classes;

/*
 * start time = 1:05
 * end time = 2:22
 * total time = 77 minutes
 * speed = 100%!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * memory = 94.55%
 * notes:
 * WTF!?!?!?! hard as hell, 3 wrong submissions, but great final score
 */
public class Solution {
    public Node insert(Node head, int insertVal) {
        if(head==null) {
            head = new Node(insertVal);
            head.next = head;
            return head;
        }
        if(head.next==head) {
            Node newNode = new Node(insertVal,head);
            head.next = newNode;
            return head;
        }
        Node temp = head;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(temp.next!=head) {
            min = Math.min(min,temp.val);
            max = Math.max(max, temp.val);
            temp = temp.next;
        }
        min = Math.min(min,temp.val);
        max = Math.max(max, temp.val);
        int range = max-min;
        if(min>insertVal||max<insertVal) {
            if(range==0) {
                Node newNode = new Node(insertVal,temp.next);
                temp.next = newNode;
            } else {
                while(temp.val<=temp.next.val) {
                    temp = temp.next;
                }
                Node newNode = new Node(insertVal,temp.next);
                temp.next = newNode;
            }
        } else {
            if(range==0) {
                // is equal to all the numbers
                Node newNode = new Node(insertVal,temp.next);
                temp.next = newNode;
            } else {
                while(temp.next.val<=insertVal) {
                    temp=temp.next;
                }
                Node newNode = new Node(insertVal,temp.next);
                temp.next = newNode;
            }
        }
        return head;
    }
}


/**
 * scenarios:
 * 1. all of the numbers are
 */