import java.util.ArrayList;

class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);
        return result;
    }

    static void generate(int n, int open, int close, String curr, List<String> result){

        if(curr.length() == 2*n){
            result.add(curr);
            return;
        }

        if(open < n){
            generate(n, open+1, close, curr+"(", result);
        }

        if(close < open){
            generate(n, open, close+1, curr+")", result);
        }
    }
}