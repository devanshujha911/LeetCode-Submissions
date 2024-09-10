class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0, j=0, min=Integer.MAX_VALUE, sum=0;
        while(i<nums.length){
            sum=sum+nums[i];
            i++;
            while(sum>=target){
                min = Math.min(min, i-j);
                sum-=nums[j];
                j++;
            }
            
            
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}