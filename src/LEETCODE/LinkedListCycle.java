package LEETCODE;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode oneS = head;
        ListNode twoS = head;

        while(twoS != null && twoS.next != null){
            oneS = oneS.next;
            twoS = twoS.next.next;

            if (oneS == twoS) return true;
        }
        return  false;
    }

}
