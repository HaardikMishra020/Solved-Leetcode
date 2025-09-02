class Solution {
    public int majorityElement(int[] nums) {
        int maxFreqEle=nums[0];
        int maxFreq=1;
        for(int i=1;i<nums.length;i++){
            if(maxFreq==0) maxFreqEle=nums[i];
            if(nums[i]==maxFreqEle) maxFreq++;
            else{
                maxFreq--;
            }
        }

        return maxFreqEle;
        
    }
}