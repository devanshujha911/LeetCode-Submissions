class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        // result = [0,0];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    // result = [i, j];
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}