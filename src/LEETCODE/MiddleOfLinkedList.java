package LEETCODE;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {

        int size = 0;
        ListNode temp = head;
        while (head != null){
            head = head.next;
            size++;
        }
        for (int i = 0; i < size/2; i++) {
            temp = temp.next;
        }
        return temp;
    }


}
