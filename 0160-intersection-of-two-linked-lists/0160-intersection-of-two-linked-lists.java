/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode A = headA;
        ListNode B = headB;

        int lenA = 0;
        int lenB = 0;
        while(A!=null){
            lenA++;
            A = A.next;
        }
        while(B!=null){
            lenB++;
            B = B.next;
        }

        A = headA;
        B = headB;

        if(lenA > lenB){
            while(lenA != lenB){
                A = A.next;
                lenA--;
            }
        } else {
            while(lenA != lenB){
                B = B.next;
                lenB--;
            }
        }

        while(A!=null){
            if(A==B) return A;
            A = A.next;
            B = B.next;
        }
        return null;
    }
}