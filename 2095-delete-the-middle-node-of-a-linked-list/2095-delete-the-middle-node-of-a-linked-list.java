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
    public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        ListNode curr = head;

        while(curr!=null){
            len++;
            curr = curr.next;
        }

        int mid = (len/2)+1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        curr = head;

        for(int i=0; i<mid-1; i++){
            curr = curr.next;
            temp = temp.next;
        }

        temp.next = curr.next;
        return dummy.next;

    }
}