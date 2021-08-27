package Demo02;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        l1.next = node1;
        node1.next = node2;

        ListNode l2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        l2.next = node3;
        node3.next = node4;
        System.out.println(mergeTwoLists(l1, l2));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)return l2;
        else if (l2==null)return l1;
        ListNode head=null,r=null;
        ListNode p=l1,q=l2;
        while (p!=null&&q!=null){
            if (p.val<q.val){
                if (head==null){head=l1;r=l1;}
                else {r.next=p;r=p;}
                p=p.next;
            }
            else {
                if (head==null){head=l2;r=l2;}
                else {r.next=q;r=q;}
                q=q.next;
            }
        }
        if (p!=null)r.next=p;
        else if (q!=null)r.next=q;
        return head;
    }
}
