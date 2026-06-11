class Solution {
    public int compress(char[] chars) {
        int n = chars.length , idx=0 , i =0 ;
        for(i=0 ; i < n;i++){
            char ch = chars[i];
            int count =0 ;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            chars[idx++]=ch ;
            if(count>1){
                String str = String.valueOf(count);
                for(char digit : str.toCharArray()){
                    chars[idx++]=digit ;
                }
            }
            i-- ;
        }
        return idx ;
    }
}
