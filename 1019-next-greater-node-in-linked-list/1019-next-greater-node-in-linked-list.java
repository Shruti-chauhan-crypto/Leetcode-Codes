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
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
        ArrayList<Integer> values = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null){
            values.add(temp.val);
            temp = temp.next;
        }

        int n = values.size();
        int[] ans = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<n; i++){

            while(!stack.isEmpty() && values.get(i) > values.get(stack.peek())){
                int index = stack.pop();
                ans[index] = values.get(i);
            }

            stack.push(i);
        }

        return ans;

    }
}