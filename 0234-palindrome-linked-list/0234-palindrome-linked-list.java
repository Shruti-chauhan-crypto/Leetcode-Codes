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
    public boolean isPalindrome(ListNode head) {
       
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }

        int l = 0;
        int r = arr.size()-1;

        while(l<r){
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);

            l++;
            r--;
        }

        curr = head;
        l = 0;

        while(curr != null){
            if(curr.val != arr.get(l)) return false;
            l++;
            curr = curr.next;
        }

        return true;
    }
}