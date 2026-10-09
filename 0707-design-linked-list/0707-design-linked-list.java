class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val){
            this.val = val;
        }
    }

    ListNode head;
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {

        ListNode curr = head;
        for(int i=0; i<index; i++){
            if(curr==null) return -1;
            curr = curr.next;
        }

        return curr==null?-1:curr.val; 
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);

        if(head==null) head=newNode;
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);

        if(head==null) head=newNode;
        else{
            ListNode curr = head;
            while(curr.next!=null) curr = curr.next;
            curr.next = newNode;
            newNode.prev = curr;
        }
    }
    
    public void addAtIndex(int index, int val) {

        if(index<0) return;
        ListNode newNode = new ListNode(val);

        if(index==0){
            newNode.next = head;
            if(head!=null) head.prev = newNode;
            head = newNode;
            return;
        }

        ListNode curr = head;
        for(int i=0; i<index-1 && curr!=null; i++){
            curr = curr.next;
        }

        if(curr==null) return;

        newNode.next = curr.next;
        newNode.prev = curr;

        if(curr.next!=null){
            curr.next.prev = newNode;
        }

        curr.next = newNode;
    }
    
    public void deleteAtIndex(int index) {

        if(index<0) return;
        ListNode curr = head;
        for(int i=0; i<index && curr!=null; i++){
            curr = curr.next;
        }

        if(curr==null) return;

        if(curr.prev==null){
            head = curr.next;
            if(head!=null) head.prev = null;
        } else if(curr.next==null){
            curr.prev.next = null;
        } else{
            curr.next.prev = curr.prev;
            curr.prev.next = curr.next;
        }

        curr.prev = null;
        curr.next = null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */