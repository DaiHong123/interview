package xiaozhao2016.sixth;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description: 链表回文
 * @Author: daihong
 * @Date: Created in  2018/8/25
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
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(chkPalindrome(listNode1));
    }
    public static boolean chkPalindrome(ListNode A) {
        if (A==null) return false;
        Deque<Integer> deque = new ArrayDeque<>();
        while (A!=null){
            deque.add(A.val);
            A = A.next;
        }
      if ((deque.size()&1)==1){
            return false;
      }else {
        while (deque.size()!=0){
            if (!deque.removeFirst().equals(deque.removeLast())){
                return false;
            }
        }
      }
        return true;
    }
}
