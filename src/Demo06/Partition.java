package Demo06;

public class Partition {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l1.next=l2; //l2.next =l3; l3.next=l4; l4.next=l5; l5.next=l6;
        System.out.println(partition(l1, 0));
    }
    public static ListNode partition(ListNode head, int x) {
        if (head==null||head.next==null)return head;
        ListNode small=null,sFinal=null,large=null,lFinal=null;
        ListNode p = head;
        while (p!=null){
            if (p.val<x){
                if (small==null){small=p;sFinal=p;}
                else {sFinal.next=p;sFinal=p;}
            }
            else {
                if (large==null){large=p;lFinal=p;}
                else {lFinal.next=p;lFinal=p;}
            }
            p=p.next;
        }
        if (small==null)return large;
        else if (large==null)return small;
        sFinal.next=large;
        lFinal.next=null;
        return small;
    }
}
