class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for (int x:map.keySet()){
            if(map.get(x)>1){
                res.add(x);
            }
        }
        // if(res.isEmpty()){
        //     res.add(-1);
        //     // return res;
        // }
        Collections.sort(res);
        return res;
    }
}
