class Solution {
    public int compareVersion(String version1, String version2) {
        String []tokens1=version1.split("\\.");
        String []tokens2=version2.split("\\.");
        int x= Math.abs(tokens1.length-tokens2.length);
        // while(x>0){
        //     if(tokens1.length>tokens2.length){
        //         tokens2[tokens2.length+x]="0";
        //     }
        //     else tokens1[tokens1.length+x]="0";
        //     x--;
        // }
        System.out.println(Integer.parseInt("05"));
        System.out.println(Integer.parseInt("1"));
        int ans=0;
        int i=0;
        while(i<tokens1.length&&i<tokens2.length){
            if(Integer.parseInt(tokens1[i])<Integer.parseInt(tokens2[i])){
                return -1;
                
            }
            else if(Integer.parseInt(tokens1[i])>Integer.parseInt(tokens2[i])){
                return 1;
                
            }
            else {}
            i++;
        }
        while(i<tokens1.length){
            if(Integer.parseInt(tokens1[i])>0){
            return 1;
            }
            i++;
        }
        while(i<tokens2.length){
            if(Integer.parseInt(tokens2[i])>0){
                return -1;
                
            }
            i++;
        }
        return ans;
        
    }
}