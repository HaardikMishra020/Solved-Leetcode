class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int p1=0;
        int p2=1;
        while(p2<nums.length){
            if(nums[p1]==nums[p2])
            {
                p2++;
            }
            else 
            {
                p1++;
                nums[p1]=nums[p2];

            }
            
        }
        return p1+1;
    }
}