class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int z=0;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
            if(nums[j]==0){
                z++;
            }
            j++;
        }
        for(int x=i;x<i+z;x++){
            nums[x]=0;
        }
        
    }
}