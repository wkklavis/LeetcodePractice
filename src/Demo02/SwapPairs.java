package Demo02;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        System.out.println(swapPairs(head));
    }
    public static ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null)return head;
        ListNode back = new ListNode();
        ListNode start = back;
        back.next = head;
        ListNode p=head , q=head.next;
        while (q!=null){
            back.next = q;
            p.next = q.next;
            q.next = p;
            if (p.next!=null) {
                back = p;
                p = p.next;
                q = p.next;
            }
            else break;
        }
        return start.next;
    }
}
