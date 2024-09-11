class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int left=0, right=0;

        for(int i=0; i<n;i++){
            leftSum[i]=left;
            left+=nums[i];
        }
        for(int i=n-1; i>=0; i--){
            rightSum[i]=right;
            right+=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return nums;
    }
}