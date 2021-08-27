package Demo02;
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        /*node1.next = node2;
        node2.next = node3;
        node3.next = node4;*/
        System.out.println(removeNthFromEnd(head, 2));
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode front=head;
        ListNode back=head;
        while (front.next!=null){
            front=front.next;
            n--;
            if (n<0)back=back.next;
        }
        if (n>0)return head.next;
        if (back!=null&&back.next!=null){
            if (back.next.next!=null)back.next=back.next.next;
            else back.next = null;
        }
        else return null;
        return head;
    }
}
