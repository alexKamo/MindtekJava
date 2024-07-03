package LEETCODE;

public class DeleteMiddle {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode sn = head, fn = head, prev = null;
        while(fn != null && fn.next != null){
            prev = sn;
            sn = sn.next;
            fn = fn.next.next;
        }
        // delete middle node : sn
        prev.next = sn.next;
        return head;
    }
}
