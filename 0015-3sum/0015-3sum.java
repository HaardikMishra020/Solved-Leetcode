class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length<3){
            return ans;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==-nums[i]){
                    List<Integer>l=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(l);
                    while(k>j&&nums[k]==nums[k-1]) k--; k--;
                    while(j<k&&nums[j]==nums[j+1]) j++; j++;
                    
                }
                else if (nums[j]+nums[k]>-nums[i]){
                    k--;
                }
                else j++;
            }

        }
        return ans;
        
    }
}