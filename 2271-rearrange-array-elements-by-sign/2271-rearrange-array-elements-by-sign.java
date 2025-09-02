class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int[]ans=new int[l];
        int p=0;
        int n=1;
        int x=0;
        while(x<nums.length){
            if(nums[x]>0){
                ans[p]=nums[x];
                p+=2;
            }
            else{
                ans[n]=nums[x];
                n+=2;
            }
            x++;
        }

        return ans;
       
    }
}