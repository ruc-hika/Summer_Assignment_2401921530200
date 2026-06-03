class Solution {
    public int maxArea(int[] height) {
        int start=0 , end = height.length-1,maxcap=0 ;
        while(start<end){
            int h = Math.min(height[start],height[end]);
            int width = end - start ;
            int currcap=h*width;
            maxcap= Math.max(currcap,maxcap);
            if(height[start]<height[end]){
                start++;
            }else {
                end-- ;
            }
        }
        return maxcap ;
    }
}
