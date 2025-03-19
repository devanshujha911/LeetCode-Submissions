class Solution {
    public int maxFrequencyElements(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }
        // int count = 0;
        // int maxFreq = Integer.MIN_VALUE;
        // for(int freq : map.values()){
        //     maxFreq = Math.max(freq, maxFreq);
        // }
        // for(int freq: map.values()){
        //     if(freq == maxFreq){
        //         count+=maxFreq;
        //     }
        // }
        // return count;

        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int freqMax = 0;
        for(int i:map.keySet()){
            freqMax = Math.max(map.get(i), freqMax);
        }
        int res=0;
        for(int i:map.keySet()){
            if(map.get(i)==freqMax){
                res = res+freqMax;
            }
        }
        return res;
    }
}