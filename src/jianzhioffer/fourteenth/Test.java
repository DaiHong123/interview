package jianzhioffer.fourteenth;

/**
 * @Description:
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @Author: daihong
 * @Date: Created in  2018/8/29
 */
public class Test {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        if (k<0) return null;
        if (head==null) return null;
        ListNode pHead = head;
        ListNode s = head;
        int n = 0;
        while (s!=null){
            n++;
            s = s.next;
        }
        if(k>n){
            return null;
        }
        while (k!=0){
            pHead = pHead.next;
            --k;
        }
        while (pHead!=null){
            head = head.next;
            pHead = pHead.next;
        }
        return head;
    }

}
