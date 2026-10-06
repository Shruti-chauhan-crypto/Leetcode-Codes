import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int minAddToMakeValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(stack.peek() == null){
                    count++;
                } else {
                    stack.pop();
                }
            } else {
                stack.push('(');
            }
        }

        count += stack.size();

        return count;
    }
}