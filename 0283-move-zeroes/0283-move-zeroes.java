class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int i=0;
        while(j<nums.length){
            if(nums[j]!=0){
                int x=nums[i];
                nums[i]=nums[j];
                nums[j]=x;
                i++;
            }
            j++;
        }
        
    }
}