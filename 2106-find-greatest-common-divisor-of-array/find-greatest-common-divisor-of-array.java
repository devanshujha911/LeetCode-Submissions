class Solution {
    public int findGCD(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            smallest = Math.min(smallest, nums[i]);
            largest = Math.max(largest, nums[i]);
        }
        int res=1,ans=1;
        while(res<=smallest){
            if(smallest%res==0 && largest%res==0){
                ans = res;
            }
            res++;
        }
        // for(int i=1; i<=smallest;i++){
        //     if(smallest%i==0 && largest%i==0){
        //         ans = i;
        //     }
        // }
        return ans;
    }
}