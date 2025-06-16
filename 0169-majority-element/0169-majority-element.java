class Solution {
    public int majorityElement(int[] nums) {
        int curel=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curel){
                c++;
            }
            else{
                if(c>1) c--;
                else {
                    curel=nums[i];
                    c=1;
                }
            }
        }
        return curel;
        
    }
}