class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=-1;
        int p1=0;
        int p2=0;
        while(p2<nums.length){
            int tempmax=0;
            while(p2<nums.length && nums[p2]==1 ){
                tempmax++;
                p2++;
            }
            if(tempmax>max)
            max=tempmax;
            tempmax=0;
            p2++;
        }
        return max;
        
    }
}