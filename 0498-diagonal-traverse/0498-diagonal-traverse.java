class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int [] ans=new int[rows*cols];
        int i=0;
        int j=0;
        int x=0;
        while(i<rows&&j<cols){
            ans[x]=mat[i][j];
            x++;
            if(i%2==0&&j%2==0||i%2!=0&&j%2!=0){
                if(j==cols-1&&i<rows-1) {
                    i++;
                }
                else
                if(i==0){
                    j++;
                }
                else{
                    i--; j++;
                }
            }
            else{
                if(j==0&&i<rows-1){
                    i++;
                }
                else
                if(i==rows-1){
                    j++;
                }
                else{ i++; j--;}
            }
            
        }

        return ans;
        

        
    }
}