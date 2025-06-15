class Solution {
    public void rightrotate(int []nums){
        int x=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=x;
    }
    public void rotate(int[] nums, int k) {
        int er = k% nums.length;
        if(er==0){
            return;
        }
        int []lasts=new int[er];
        for(int i=nums.length-er;i<nums.length;i++){
            lasts[i-nums.length+er]=nums[i];
        }
        for(int i=nums.length-1;i>=er;i--){
            nums[i]=nums[i-er];
        }
        for(int i=0;i<er;i++){
            nums[i]=lasts[i];
        }
        return;
        
    }
}