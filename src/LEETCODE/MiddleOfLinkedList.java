package LEETCODE;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {

        int size = 0;
        ListNode temp = head;
        while (head != null){
            head = head.next;
            size++;
        }
        // size / 2 is a middle length
        for (int i = 0; i < size/2; i++) {
            temp = temp.next;
        }
        return temp;
    }


}
