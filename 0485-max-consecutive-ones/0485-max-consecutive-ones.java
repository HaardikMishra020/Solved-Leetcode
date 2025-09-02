class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int maxOnes=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(i==l-1&&nums[i]==1){
                ones++;
            }
            if (i<l-1&&nums[i]==1&&nums[i+1]==1){
                ones++;
            }
            else if(i<l-1&&nums[i]==1&&nums[i+1]==0){
                ones++;
                maxOnes=Math.max(maxOnes,ones);
                ones=0;
            }
            else{}
        }

        return Math.max(ones,maxOnes);
        
    }
}