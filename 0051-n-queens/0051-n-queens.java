class Solution {

    static List<List<String>> ans;

    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        boolean arr[][] = new boolean[n][n];
        solve(n,arr,0);
        return ans;
    }

    public void solve(int tq, boolean arr[][], int row){

        if(tq==0){
            display(arr,ans);
            return;
        }

        if(row==arr.length) return;

        for(int col=0; col<arr[0].length; col++){
            if(isSafe(arr,row,col)){
                arr[row][col] = true;
                solve(tq-1,arr,row+1);
                arr[row][col] = false;
            }
        }
    }

    public boolean isSafe(boolean arr[][], int row, int col){
        
        int i = row-1;
        int j = col;

        while(i>=0){
            if(arr[i][j]) return false;
            i--;
        }

        i=row-1;
        j=col-1;
        while(i>=0 && j>=0){
            if(arr[i][j]) return false;
            i--;
            j--;
        }

        i=row-1;
        j=col+1;
        while(i>=0 && j<arr.length){
            if(arr[i][j]) return false;
            i--;
            j++;
        }

        return true;
    }

    public void display(boolean[][] arr, List<List<String>> ans){

        List<String> board = new ArrayList<>();

        for(int i=0; i<arr.length; i++){

            String row = "";
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]){
                    row += "Q";
                } else {
                    row += ".";
                }
            }

            board.add(row);
        }

        ans.add(board);
    }
}