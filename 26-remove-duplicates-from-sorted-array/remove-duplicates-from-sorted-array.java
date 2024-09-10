class Solution {
    public int removeDuplicates(int[] nums) {
        int shiftInd = 1;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                nums[shiftInd]=nums[i+1];
                shiftInd++;
            }
        }
        return shiftInd;
    }
}