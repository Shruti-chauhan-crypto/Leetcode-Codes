class BrowserHistory {

    class Node {
        String val;
        Node next;
        Node prev;

        Node(String val){
            this.val = val;
        }
    }

    Node head;
    Node curr;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curr = head;
    }
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.prev = curr;
        curr.next = newNode;
        curr = newNode;
    }
    
    public String back(int steps) {
        
        while(steps>0 && curr.prev!=null){
            curr = curr.prev;
            steps--;
        }

        return curr.val;
    }
    
    public String forward(int steps) {
        
        while(steps>0 && curr.next!=null){
            curr = curr.next;
            steps--;
        }

        return curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */