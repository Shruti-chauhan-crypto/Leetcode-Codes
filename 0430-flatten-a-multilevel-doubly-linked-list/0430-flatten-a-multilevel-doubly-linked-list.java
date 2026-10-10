/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        Node curr = head;

        while(curr != null){

            if(curr.child != null){
                Node next = curr.next;
                Node temp = curr.child;

                temp.prev = curr;
                curr.next = temp;
                while(temp.next != null){
                    temp = temp.next;
                }

                temp.next = next;
                if(next!=null) next.prev = temp;
                curr.child = null;
            }

            curr = curr.next;
        }

        return head;
    }
}