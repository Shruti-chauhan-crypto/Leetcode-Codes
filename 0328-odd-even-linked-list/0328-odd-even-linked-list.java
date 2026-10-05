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
    public ListNode oddEvenList(ListNode head) {

        ArrayList<Integer> arr = new ArrayList<>();

        if(head==null) return null;
        ListNode temp1 = head;
        ListNode temp2 = head.next;

        while(temp1!=null){
            arr.add(temp1.val);
            if(temp1.next==null) break;
            temp1 = temp1.next.next;
        }

        while(temp2!=null){
            arr.add(temp2.val);
            if(temp2.next==null) break;
            temp2 = temp2.next.next;
        }

        temp1 = head;
        int i = 0;

        while(temp1!=null){
            temp1.val = arr.get(i++);
            temp1 = temp1.next;
        }

        return head;
    }
}