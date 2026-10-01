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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int length = 0;
        ListNode curr = head;

        while(curr != null){
            length++;
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        curr = head;

        while(length != n){
            curr = curr.next;
            temp = temp.next;
            length--;
        }
        temp.next = curr.next;

        return dummy.next;
    }
}