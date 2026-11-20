class Solution {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1; i<=9; i++){
            solve(n,i,ans);
        }
        return ans;
    }

    static void solve(int n, int num, List<Integer> ans){

        if(num>n) return;

        ans.add(num);
        for(int i=0; i<=9; i++){
            solve(n,num*10+i,ans);
        }
    }
}