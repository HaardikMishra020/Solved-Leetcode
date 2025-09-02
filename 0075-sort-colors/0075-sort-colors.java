class Solution {
    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int z=0;
        int o=0;
        int t=nums.length-1;
        while(o<=t){
            if(nums[o]==0){
                swap(nums,o,z);
                z++;
                o++;
            }
            else if(nums[o]==1){
                o++;
            }
            else {
                swap(nums,o,t);
                t--;
            }
        }
        
    }
}