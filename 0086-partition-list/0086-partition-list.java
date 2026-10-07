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
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummy1 = new ListNode(0);
        ListNode temp = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode prev = dummy2;
        ListNode curr = head;

        while(curr != null){

            if(curr.val < x){
                prev.next = curr;
                curr = curr.next;
                prev = prev.next;
            } else {
                temp.next = curr;
                temp = temp.next;
                curr = curr.next;
            }
        }

        temp.next = null;
        prev.next = dummy1.next;
        return dummy2.next;
    }
}