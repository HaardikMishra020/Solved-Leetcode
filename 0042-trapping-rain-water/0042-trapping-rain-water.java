class Solution {
    public int trap(int[] height) {
        int l=height.length;
        int []leftb=new int[l];
        int []rightb=new int[l];
        int i=0;
        int j=l-1;
        int rmax=0;
        int lmax=0;
        rightb[j]=0;
        leftb[i]=0;
        while(j>0){
            rmax=Math.max(rmax,height[j]);
            rightb[j-1]=rmax;
            j--;
        }
        while(i<l-1){
            lmax=Math.max(lmax,height[i]);
            leftb[i+1]=lmax;
            i++;
        }
        int allarea=0;
        for(int ii=0;ii<l;ii++){
            allarea+=Math.max(Math.min(rightb[ii],leftb[ii])-height[ii],0);
        }
        return allarea;
    }
}