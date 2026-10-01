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
        
        ListNode curr = head;
        ListNode temp = curr.next;
        ListNode next = curr;

        for(int i=0; i<n; i++){
            next = next.next;
        }
        if(next==null) return temp;

        while(next.next != null){
            curr = curr.next;
            temp = temp.next;
            next = next.next;
        }
        curr.next = temp.next;

        return head;
    }
}