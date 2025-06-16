class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int o=0;
        int t=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            z++;
            else if (nums[i]==1)
            o++;
            else t++;
        }
        int x=0;
        while(z!=0){
            nums[x]=0;
            z--;
            x++;
        }
        while(o!=0){
            nums[x]=1;
            o--;
            x++;
        }
        while(t!=0){
            nums[x]=2;
            t--;
            x++;
        }

        return;
    }
}