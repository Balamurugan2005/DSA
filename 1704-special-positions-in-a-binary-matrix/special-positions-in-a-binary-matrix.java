class Solution {
    public int numSpecial(int[][] mat) {
        int row =mat.length;
        int col = mat[0].length;
        int ans=0;

        int [] rowCount =new int[row];
        int [] colCount=new int[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    if(rowCount[i]==1 && colCount[j]==1){
                        ans++;
                    }
                }
            }
        }
        return ans;

    }
}