class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLen=0;
        for(int num:set){
            int x=0;
            int len=0;
            if(!set.contains(num-1)){
                while(set.contains(num+x)){
                len++;
                x++;
            }
            maxLen=Math.max(maxLen,len);
            }
            else continue;
        }

        return maxLen;
        
    }
}