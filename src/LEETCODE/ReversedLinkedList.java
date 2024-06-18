package LEETCODE;

public class ReversedLinkedList {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;

        print(n1);
        System.out.println("====================");
//        ListNode newHead = reverseList(n1);
//        print(newHead);

        System.out.println("====================");
//        makeSquareEachValue(n1);
//        print(n1);

        System.out.println("====================");

        int total = calculateSum(n1);
        System.out.println("Sum of all elements " + total);
        System.out.println("====================");

    }

    private static int calculateSum(ListNode n1) {
        int sum = 0;
        ListNode curr = n1;
        while(curr!=null){
            sum+=curr.val;
            curr = curr.next;
        }
        return  sum;
    }

    private static void makeSquareEachValue(ListNode n1) {
        ListNode curr = n1;
        while (curr!=null){
            curr.val *= curr.val;
            curr = curr.next;
        }
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null, third = null;
        ListNode curr = head;
        while(curr!=null){
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
        }
        return prev;
    }
    private  static void print(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
