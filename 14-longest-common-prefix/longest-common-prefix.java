class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];
        for(int i=0; i<Math.min(start.length(), end.length());i++){
            if(start.charAt(i)!=end.charAt(i)){
                return res.toString();
            }
            res.append(start.charAt(i));
        }
        return res.toString();
        
    }
}