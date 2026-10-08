class Solution {
    public String removeOuterParentheses(String s) {

        int open = 0;
        String ans = "";

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            if(ch == '('){
                if(open>0) ans = ans + ch;
                open++;
            } else {
                open--;
                if(open>0) ans = ans + ch;
            }
        }

        return ans;
    }
}