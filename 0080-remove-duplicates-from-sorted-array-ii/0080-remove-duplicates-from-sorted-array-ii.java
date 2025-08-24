class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3){
            return nums.length;
        }
        int s=0;
        int e=0;
        while(e<nums.length){
            if(s<2||nums[e]!=nums[s-2]){
                nums[s]=nums[e];
                s++;
            }
            e++;
        }
        return s;
    }
}