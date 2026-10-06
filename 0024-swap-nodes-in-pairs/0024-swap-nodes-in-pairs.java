/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null) return head;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode t1 = head;
        ListNode t2 = head.next;

        while(t2!=null){
            t1.next = t2.next;
            t2.next = t1;
            temp.next = t2;

            temp = t1;
            t1 = t1.next;
            if(t1==null) break;
            t2 = t1.next;
        }

        return dummy.next;
    }
}