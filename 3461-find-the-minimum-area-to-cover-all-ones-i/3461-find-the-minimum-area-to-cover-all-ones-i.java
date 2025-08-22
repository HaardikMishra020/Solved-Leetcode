class Solution {
    public int minimumArea(int[][] grid) {
        int t=grid.length-1;
        int b=0;
        int l=grid[0].length-1;
        int r=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(i<t)
                    t=i;
                    if(i>b)
                    b=i;
                    if(j<l)
                    l=j;
                    if(j>r)
                    r=j;
                }
            }
        }

        return (b-t+1)*(r-l+1);
    }
}