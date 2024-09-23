class Solution {
    public void moveZeroes(int[] nums) {
        int [] temp = new int [nums.length];
        int n = nums.length;
        int count=0;
        int k = 0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                temp[k]=nums[i];
                k++;
            }else{
                count++;
            }
        }
        for(int i=0; i<n-count; i++){
            nums[i]=temp[i];
        }
        for(int i=n-count; i<n; i++){
            nums[i]=0;
        }
    }
}