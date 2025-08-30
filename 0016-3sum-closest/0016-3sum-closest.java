class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int s=nums[i]+nums[j]+nums[k];
                if(s==target) return s;
                else{
                    if(Math.abs(target-s)<min){
                    min=Math.abs(target-s);
                    sum=s;
                }
                if(s<target) j++;
                else k--;
                }
            }
        }

        return sum;
        
    }
}