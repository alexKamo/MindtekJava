package LEETCODE;

public class DeleteMiddle {

    public ListNode deleteMiddle(ListNode head) {

        ListNode sn = head, fn = head, prev = null;
        while(fn != null && fn.next != null){
            prev = sn;
            sn = sn.next;
            fn = fn.next.next;
        }
        if (head.next == null) return null;
        // delete middle node : sn
        prev.next = sn.next;
        return head;
    }
}
