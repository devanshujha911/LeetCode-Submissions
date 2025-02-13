class Solution {
    public int maxSubArray(int[] nums) {
        // int maxSum = nums[0];
        // for(int i=0;i<nums.length;i++){
        //     int sum =0;
        //     for(int j=i; j<nums.length; j++){
        //         sum = sum+nums[j];
        //         if(sum>maxSum){
        //             maxSum = sum;
        //         }
        //     }    
        // }
        // return maxSum;   

        int maxSum = nums[0];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<=0){
                sum = 0;
            }
        }
        return maxSum;

        // int maxSum = nums[0];
        // int sum=0;
        // for(int i=0; i<nums.length; i++){
        //     sum = sum + nums[i];
        //     maxSum = Math.max(sum, maxSum);

        // }
    }
}