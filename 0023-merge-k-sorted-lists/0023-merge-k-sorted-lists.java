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
import java.util.Collections;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<lists.length; i++){
            ListNode curr = lists[i];
            while(curr != null){
                arr.add(curr.val);
                curr = curr.next;
            }
        }

        Collections.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for(int i=0; i<arr.size(); i++){
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }

        return dummy.next;
    }
}