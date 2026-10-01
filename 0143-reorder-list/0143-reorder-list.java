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

import java.util.ArrayList;

class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }

        curr = head;
        int l = 0;
        int r = arr.size()-1;

        while(curr != null){
            curr.val = arr.get(l);
            curr = curr.next;
            if(curr == null) break;
            curr.val = arr.get(r);
            curr = curr.next;
            l++;
            r--;
        }
    }
}