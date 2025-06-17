class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){ 
                neg[n]=nums[i];
                n++;
                }
            else {
                pos[p]=nums[i];
                p++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos[i/2];
            }
            else nums[i]=neg[i/2];
        }
    return nums;
        
    }
}