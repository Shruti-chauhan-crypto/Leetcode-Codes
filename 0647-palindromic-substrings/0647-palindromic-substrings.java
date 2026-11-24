class Solution {

    static int count = 0;
    public int countSubstrings(String s) {
        count = 0;
        for(int i=0; i<s.length();i++){
            subString(s,i,i);
        }
        return count;
    }

    public void subString(String s, int start, int end){

        if(end==s.length()) return;
        String ans = s.substring(start, end+1);

        if(isPalindrome(ans)) count++;

        subString(s, start, end+1);
    }

    public boolean isPalindrome(String ans){
        int i = 0;
        int j = ans.length()-1;

        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}