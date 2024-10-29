class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=lowLimit; i<=highLimit; i++){
            int temp = i;
            int sum=0;
            while(temp!=0){
                sum+=temp%10;
                temp=temp/10;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);    
        }
        int count = Integer.MIN_VALUE;
        for(int i : map.values()){
            count = Math.max(count, i);
        }
        return count;
    }
}