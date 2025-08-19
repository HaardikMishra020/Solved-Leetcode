class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=1;
        int r=numbers.length;
        while(l<r){
            if (numbers[l-1]+numbers[r-1]==target)
            return new int[]{l,r};
            else if (numbers[l-1]+numbers[r-1]>target)
            r--;
            else l++;

        }
        return new int[]{0};
        
    }
}