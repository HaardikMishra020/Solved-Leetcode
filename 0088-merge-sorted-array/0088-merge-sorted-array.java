class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Stack<Integer>st=new Stack<>();
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                st.push(nums1[i]);
                i++;
            }
            else{
                st.push(nums2[j]);
                j++;
            }
        }
        while(i<m) {st.push(nums1[i]); i++;}
        while(j<n) {st.push(nums2[j]); j++;}
        for(int ii=nums1.length-1;ii>=0;ii--){
            nums1[ii]=st.pop();
        }


        
    }
}