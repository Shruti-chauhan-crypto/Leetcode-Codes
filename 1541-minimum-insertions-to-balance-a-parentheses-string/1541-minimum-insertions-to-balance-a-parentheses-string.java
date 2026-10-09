class Solution {
    public int minInsertions(String s) {
        
        int open = 0;
        int close = 0;

        int ans = 0;
        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)=='('){
                open++;

                if(close==1 && open==1){
                    ans += 2;
                    close--;
                } else if(close==1 && open>1){
                    ans++;
                    open--;
                    close--;
                }

            } else {
                close++;

                if(close==2 && open==0){
                    ans++;
                    close = 0;
                } else if(close==2 && open>0){
                    open--;
                    close = 0;
                }
            }
        }

        if(close==1 && open==0) ans += 2;
        else ans += Math.abs(open*2 - close);

        return ans;
    }
}