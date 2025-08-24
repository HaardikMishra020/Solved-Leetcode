class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length%k!=0){
            return false;
        }
        int d=nums.length/k;
        Arrays.sort(nums);
        int i=1;
        int maxf=1;
        int x=1;
        while(i<nums.length){
            if(nums[i]!=nums[i-1]){
                x=0;
            }
            x++;
            i++;
            maxf=Math.max(maxf,x);
        }
        if(maxf>d){
            return false;
        }

        return true;
        
    }
}