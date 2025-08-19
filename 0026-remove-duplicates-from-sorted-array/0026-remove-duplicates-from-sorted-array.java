class Solution {
    public int removeDuplicates(int[] nums) {
        int f=0;
        int s=0;
        while(s<nums.length){
            if(nums[f]!=nums[s]){
                f++;
                nums[f]=nums[s];
            }
            s++;
        }
        return f+1;
    }
}