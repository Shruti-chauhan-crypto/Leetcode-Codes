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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null ||head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }

        k = k%len;
        for(int i=0; i<k; i++){
            curr = head;
            ListNode temp = dummy;

            while(curr.next != null){
                curr = curr.next;
                temp = temp.next;
            }

            temp.next = curr.next;
            curr.next = head;
            dummy.next = curr;
            head = curr;
        }

        return dummy.next;
    }
}