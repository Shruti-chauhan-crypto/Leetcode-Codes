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
    public int getDecimalValue(ListNode head) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }

        int ans = 0;
        int j = 0;
        for(int i=arr.size()-1; i>=0; i--){
            ans += (int) Math.pow(2, j++) * arr.get(i);
        }

        return ans;
    }
}