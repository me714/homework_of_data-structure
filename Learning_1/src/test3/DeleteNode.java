package test3;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        ListNode b = a.next.next = new ListNode(4);
        a.next.next.next = new ListNode(5);
        a.next.next.next.next = new ListNode(6);
        a.next.next.next.next.next = new ListNode(7);
        System.out.println(a);
        ListNode x = deleteNode(b);
        System.out.println(a);
    }
    public static ListNode deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        return node;
        }
    }

