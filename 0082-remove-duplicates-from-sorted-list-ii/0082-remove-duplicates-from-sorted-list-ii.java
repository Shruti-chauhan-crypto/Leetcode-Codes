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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return null;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){

            if(curr.next != null && curr.val == curr.next.val){
                int duplicate = curr.val;
                
                while(curr != null && curr.val == duplicate){
                    curr = curr.next;
                }

                if(prev == null) head = curr;
                else prev.next = curr;

            } else {

                prev = curr;
                curr = curr.next;
            }
        }

        return head;

    }
}