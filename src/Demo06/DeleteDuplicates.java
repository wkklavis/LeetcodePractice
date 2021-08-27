package Demo06;

public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(5);
        l1.next=l2; l2.next =l3; l3.next=l4; l4.next=l5; l5.next=l6; l6.next=l7;
        System.out.println(deleteDuplicates(l1));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null)return head;
        ListNode p = new ListNode();
        p.next = head;
        ListNode q = head;
        while (q!=null&&q.next!=null){
            if (q.val==q.next.val){
                while (q.next!=null&&q.val==q.next.val)q=q.next;
                p.next = q.next;
                q = p.next;
                if (head.next!=null&&head.val==head.next.val)head=q;
            }
            else {
                p = p.next;
                q = q.next;
            }
        }
        return head;
    }
}
