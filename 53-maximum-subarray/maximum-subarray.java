class Solution {
    public int maxSubArray(int[] nums) {
        int currsum =0 ,maxSum = Integer.MIN_VALUE ;
        for(int val : nums){
            currsum += val ;
            maxSum = Math.max(currsum ,maxSum);
            if(currsum<0){
                currsum = 0 ;
            }
        }
        return maxSum ;
    }
}