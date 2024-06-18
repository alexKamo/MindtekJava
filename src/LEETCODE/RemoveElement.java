package LEETCODE;

public class RemoveElement {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode pr = head;
        ListNode curr = head.next;
        while(curr!=null){
            if (curr.val==val){
                pr.next = curr.next;
                curr = curr.next;
            }else {
                pr = curr;
                curr = curr.next;
            }
        }
        if(head.val == val) return head.next;

        return head;
    }

}
