package Demo05;

import java.util.List;

public class RotateRight {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(rotateRight(head, 2));
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null)return head;
        ListNode r = head;
        int length = 1;
        while (r.next!=null) {
            r = r.next;
            length++;
        }
        r.next = head;//循环
        k = k%length;
        while (length-k>0){
            r = r.next;
            length--;
        }
        head = r.next;
        r.next = null;
        return head;
    }
}
