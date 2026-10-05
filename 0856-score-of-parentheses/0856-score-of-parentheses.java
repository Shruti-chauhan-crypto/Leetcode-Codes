import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int scoreOfParentheses(String s) {
        
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == ')'){
                if(stack.peek() == -1) {
                    stack.pop();
                    stack.push(1);
                }
                else{
                    int ans = 0;
                    int n = stack.pop();
                    while(n != -1){
                        ans += n;
                        n = stack.pop();
                    }

                    ans *= 2;
                    stack.push(ans);
                }
            } else {
                stack.push(-1);
            }
        }

        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }

        return res;
    }
}