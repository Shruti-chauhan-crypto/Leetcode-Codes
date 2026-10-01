import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(int i=0; i<s.length(); i++){

            char cur = s.charAt(i);

            if(map.containsKey(cur)){
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if(ch != map.get(cur)) return false;
            }
            else stack.push(cur);
        }

        return stack.isEmpty();

    }
}