/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode curr = node;
        ListNode next = curr.next;

        while(next != null){
            curr.val = next.val;
            if(curr.next.next == null){
                curr.next = null;
                break;
            }
            curr = curr.next;
            next = next.next;
        }
    }
}