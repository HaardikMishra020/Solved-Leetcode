class Solution {
    public void reverse(int []nums, int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int v=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                v++;
                int swapper=-1;
                for(int b=i;b<nums.length;b++){
                    if(nums[b]>nums[i-1]){
                        swapper=b;
                    }
                }
                int temp=nums[swapper];
                nums[swapper]=nums[i-1];
                nums[i-1]=temp;
                reverse(nums,i,nums.length-1);
                break;

            }
        }
        if(v==0){
            reverse(nums,0,nums.length-1);
        }
        
    }
}